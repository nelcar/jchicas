/*Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas Sett
 * Carne:07470
 * Descripcion:
 * Esta clase permite manipular un archivo de entrada para generar un
 * archivo compreso utilizando el algoritmo de huffman.
 * Programa: Manejador.java
 *
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Manejador {

	public Huffman miHuffman;
	private FileInputStream lector;
	private FileInputStream lector2;
	private FileOutputStream escritor;
	private int tabla[];
	private long numBytes;
	private String rutaOrigen, rutaDestino;

	/**
	 * Es el constructor de la clase, e inicializa las rutas de origen y destino
	 * @param rutaOrigen es la ruta de origen
	 * @param rutaDestino es la ruta de destino
	 */

	public Manejador(String rutaOrigen, String rutaDestino){

		this.rutaOrigen=rutaOrigen;
		this.rutaDestino=rutaDestino;
		miHuffman= new Huffman(null);
		tabla =  new int[256];
	}
	/**
	 * Permite leer el archivo de entrada para generar la tabla de frecuencias
	 * de los bytes correspondientes.
	 * @throws IOException
	 * @throws FileNotFoundException
	 */

	private void readOrigen() throws IOException, FileNotFoundException{

		int byteLeido;
		numBytes=0;

		lector = new FileInputStream(rutaOrigen);

		do {
			byteLeido=lector.read();

			if(byteLeido!=-1){
				tabla[byteLeido]++;
				numBytes++;
			}
		} while (byteLeido!=-1);


		lector.close();
		generarHuffman();
	}

	/**
	 * Permite crear todos los nodos que poseen frecuencias y añadirlos a la lista enlazada
	 * para crear el arbol huffman
	 */

	private void generarHuffman(){

		Nodo aux;

		for (int i = 0; i < tabla.length; i++) {
			if(tabla[i] !=0){
				aux=new Nodo((char)i, tabla[i], true);
				miHuffman.agregarElemento(aux);
			}
		}

		miHuffman.ordenar();
		miHuffman.generarArbol();
	}
	/**
	 * Permite realizar la compresion de un archivo, escribiendo en la
	 * cabecera, la longitud del archivo con un maximo de 65535 bytes
	 * de longitud, ya que representa un WORD de longitud,  la tabla de codigos huffman, y
	 * el resto del archivo compreso.
	 *
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void compress() throws IOException, FileNotFoundException{

		String sobrante="", temp="", code="", extension="";
		int byteLeido=0;
		byte tablaTemp[][];

		readOrigen();
		lector2 = new FileInputStream(rutaOrigen);
		escritor = new FileOutputStream(rutaDestino + ".rjs");

		tablaTemp = miHuffman.getTabla();
		extension= getExtension(rutaOrigen);


		//******** ESCRIBE TABLA **********

		escritor.write((byte)(numBytes%256));
		numBytes/=256;
		escritor.write((byte)(numBytes%256));
		numBytes/=256;
		escritor.write((byte)(numBytes%256));
		numBytes/=256;
		escritor.write((byte)(numBytes%256));

		//***********Escribe la extension
		for(int i=0; i< extension.length(); i++)
			escritor.write(extension.charAt(i));

		escritor.write(miHuffman.getTamano());

		for(int i=0; i<miHuffman.getTamano(); i++){
			escritor.write(tablaTemp[i][0]);
			code=miHuffman.getCodigo((byte)tablaTemp[i][0]);
			escritor.write(binToDec(code));
			escritor.write(numZero(code));
		}

		//****** Escribe el resto del fichero **************
		do {
			byteLeido=lector2.read();

			if(byteLeido!=-1){
				if(sobrante.length()<8)
					code=miHuffman.getCodigo((byte)byteLeido);
				else
					code=sobrante;

				for(int i=0; i<code.length(); i++){

					if(temp.length()==0 && sobrante.length()!=0){//añade lo sobrante

						for(int j=0; temp.length()<8; j++){

							if(sobrante.length() != 0){
								temp+=sobrante.charAt(0);
								sobrante=sobrante.substring(1);
							}
							else
								break;
						}
						if(temp.length()==8)
							code=sobrante;
					}
					if(temp.length()<8)
						temp+=code.charAt(i);
					else{
						sobrante+= code.substring(i);
						break;
					}
				}
				if(temp.length()==8){
					escritor.write(binToDec(temp));
					temp="";
				}
			}
		} while (byteLeido!=-1);

		if(sobrante.length()!=0 && sobrante.length() <=8){
			for(int m=0; m <sobrante.length(); m++)
				temp+=sobrante.charAt(m);
		}
		if(temp.length()<8)
			for(int j=temp.length(); j<8; j++)
				temp+="0";
		escritor.write(binToDec(temp));

		lector2.close();
	}
	/**
	 * Permite saber cuantos ceros tendra delante el codigo huffman
	 * para facilitar la descompresion del archivo.
	 * @param code es el codigo huffman a analizar
	 * @return el numero de ceros que tendra delante el codigo huffman
	 */

	private int numZero(String code){
		int cont=0;
		for(int i=0; i<code.length(); i++)
			if(code.charAt(i) == '0')cont++;
			else break;
		return cont;
	}

	/**
	 * Permite convertir una cadena que representa un numero en base 2
	 * a un entero en base 10
	 * @param numero es la cadena de binarios
	 * @return el nuevo entero en base 10
	 */
	private int binToDec(String numero){
		int res=0;
		for(int i=numero.length()-1, j=0; i>=0; i--, j++)
			res += ((int)numero.charAt(j)-48) * Math.pow(2,i);

		return res;
	}

	/**
	 * Este metodo retorna la extension del archivo a comprimir
	 * @param ruta es el archivo origen
	 * @return un String
	 */
        
	private String getExtension(String ruta){
		for(int i=ruta.length()-1; i>=0; i--)
			if(ruta.charAt(i)=='.')
				return ruta.substring(i);
		return null;
	}

}
