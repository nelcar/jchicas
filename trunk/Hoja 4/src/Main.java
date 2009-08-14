

/*Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas Sett
 * Carne:07470
 * Descripcion: Clase principal que contiene toda la ejecucion del programa
 * Programa: Main.java
 *
 */



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*int var;

        Scanner scan = new Scanner(System.in);
        System.out.println(".....::::Bienvenidos::::......");
        System.out.println(" \nIngrese un mensaje:   ");
        var = scan.nextInt();*/

        /*String coso = "abaccda";

        Huffman h = new Huffman(null);

        h.agregarElemento(new Nodo('d', 1, true));
        h.agregarElemento(new Nodo('c', 2, true));
        h.agregarElemento(new Nodo('b', 1, true));

        h.agregarElemento(new Nodo('a', 3, true));
        
        


        h.ordenar();
        h.generarArbol();


        recorrer(h.raizArbol);

        int c = 3;*/


        Compresor c = new Compresor("newfile.txt", "newfilecom.txt");

        try{
        c.compress();
        recorrer(c.miHuffman.raizArbol);
        } catch (Exception e)
        {
            System.out.println(e);
        }
     
    }

    public static void recorrer(Nodo h)
    {
        if(h.hijoIzq != null)
            recorrer(h.hijoIzq);

        System.out.println("letra: " + h.letra + "\nfrecuencia: " + h.frecuencia + "\ncodigo: " + h.codigo);

        if(h.hijoDer != null)
            recorrer(h.hijoDer);


    }

}
