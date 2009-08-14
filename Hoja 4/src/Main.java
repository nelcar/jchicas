

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
