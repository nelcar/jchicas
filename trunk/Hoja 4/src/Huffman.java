

/* Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas Sett
 * Carne:07470
 * Esta clase permite generar un arbol binario de codigos huffman.
 * Programa: Huffman.java
 *
 */

public class Huffman {

	public Nodo primero, ultimo;
	public Nodo raizArbol;
	public byte tabla[][];
	public String listaCodigos[];
	private int tamano;
	private int cont;

	/**
	 * Es el constructor de la clase Huffman e inicializa el tamaño
	 * de la misma a cero
	 * @param primero
	 */

	public Huffman(Nodo primero){
		tamano=0;
		cont=0;
	}
	/**
	 * Agrega un nuevo nodo a la lista
	 * @param miNodo Es el nodo que se desea añadir
	 */
        
	public void agregarElemento(Nodo miNodo){
		if(primero==null){
                    primero=miNodo;
                    ultimo=miNodo;
		}
		else{
			Nodo aux=primero;
			while(aux.getDerecha()!=null)
				aux=aux.getDerecha();
			aux.setDerecha(miNodo);
			miNodo.setIzquierda(aux);
			ultimo=miNodo;
		}
		tamano++;
	}
        
	/**
	 * Ordena la lista enlazada de nodos por medio de su frecuencia de menor
	 * a mayor
	 *
	 */
	public void ordenar(){

		Nodo aux1=primero;
		Nodo aux2=aux1;
		int tempFrec;
		char tempLetra;

		while(aux1!=null){

			while(aux2.getDerecha()!=null){
				if(aux2.getFrecuencia()>=aux2.getDerecha().getFrecuencia()){
					tempFrec=aux2.getFrecuencia();
					tempLetra=aux2.getLetra();
					aux2.setFrecuencia(aux2.getDerecha().getFrecuencia());
					aux2.setLetra(aux2.getDerecha().getLetra());
					aux2.getDerecha().setFrecuencia(tempFrec);
					aux2.getDerecha().setLetra(tempLetra);

					if(aux2.getLetra()>aux2.getDerecha().getLetra() && aux2.getFrecuencia()==aux2.getDerecha().getFrecuencia()){
						tempFrec=aux2.getFrecuencia();
						tempLetra=aux2.getLetra();
						aux2.setFrecuencia(aux2.getDerecha().getFrecuencia());
						aux2.setLetra(aux2.getDerecha().getLetra());
						aux2.getDerecha().setFrecuencia(tempFrec);
						aux2.getDerecha().setLetra(tempLetra);
					}
				}
				aux2=aux2.getDerecha();
			}
			aux2=primero;
			aux1=aux1.getDerecha();
        }
	}
        
	/**
	 * permite generar el arbol de codigos huffman para la posterior
	 * compresion del archivo
	 */
        
	public void generarArbol(){

		Nodo aux=primero, temp;
		tabla=new byte[tamano][3];
		listaCodigos = new String[tamano];
		int peso=0;

		while(aux.getDerecha()!=null){
			if(aux.getDerecha()!=null)
				peso=aux.getFrecuencia() +  aux.getDerecha().getFrecuencia();
			else
				peso=aux.getFrecuencia();

			temp=new Nodo((char)0, peso, false);
			temp=ubicarNodo(temp, aux);
			temp.setHijoIzq(aux);
			temp.setHijoDer(aux.getDerecha());
			aux=aux.getDerecha().getDerecha();

			if(aux.getDerecha()==null)
				raizArbol=temp;
		}
		generarCodigo(raizArbol, "");
	}

	/**
	 * Permite ubicar un nodo en la lista enlazada tomando como referencia la frecuencia
	 * del nodo y el byte que representa.
	 * @param miNodo es el nodo a añadir
	 * @param aux2 es el nodo desde donde se empezara a recorrer la lista
	 * @return el nodo ubicado en la lista
	 */
        
	public Nodo ubicarNodo(Nodo miNodo, Nodo aux2){
		Nodo aux=aux2;

		while (aux!=null) {
			if(miNodo.getFrecuencia()<=aux.getFrecuencia()){
				aux.getIzquierda().setDerecha(miNodo);
				miNodo.setIzquierda(aux.getIzquierda());
				aux.setIzquierda(miNodo);
				miNodo.setDerecha(aux);
				return miNodo;
			}
			if(aux.getDerecha()==null){
				aux.setDerecha(miNodo);
				miNodo.setIzquierda(aux);
				ultimo=miNodo;
				break;
			}
			aux=aux.getDerecha();
		}
		return miNodo;
	}

	/**
	 * Genera el codigo huffman para todos los nodos que componen
	 * el arbol huffman, excepto los nodos padres.
	 * @param miNodo es el nodo desde donde se empezara a recorrer el arbol (raiz)
	 * @param cadena es la cadena inicializada en "" que permite modificarse con la recursion
	 * y sera la cadena que se le asigna como codigo huffman al nodo.
	 */
        
	public void generarCodigo(Nodo miNodo, String cadena){

		if(miNodo!=null){
			if(miNodo.isTipo()){
				miNodo.setCodigo(cadena);
				tabla[cont][0]=(byte)miNodo.getLetra();
				tabla[cont][1]=(byte)miNodo.getFrecuencia();
				listaCodigos[cont] = cadena;
				cont++;
			}
			generarCodigo(miNodo.getHijoIzq(), cadena +"0");
			generarCodigo(miNodo.getHijoDer(), cadena +"1");
		}
	}

	/**
	 * Permite obtener el codigo huffman de un byte determinado.
	 * @param Es el numero que se desea saber su codigo huffman
	 * @return el codigo huffman en formato String
	 */
	public String getCodigo(byte valor){

		for(int i=0; i<tamano; i++)
			if(tabla[i][0]==valor ){

                           // System.out.println((char) valor + " - " + listaCodigos[i]);
                            return listaCodigos[i];
                        }
		return null;
	}


	/**
	 * Devuelve la tabla de frecuencias
	 * @return la tabla de las frecuencias
	 */
	public byte[][] getTabla() {
		return tabla;
	}
	/**Devuelve el numero de Nodos en la lista Huffman
	 * @return un entero
	 */
	public int getTamano() {
		return tamano;
	}

}
