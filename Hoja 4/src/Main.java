
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

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
         *
        recorrer(h.raizArbol);

        int c = 3;*/


        Compresor c = new Compresor("newfile.txt", "newfilecom.txt");

        try {
            c.compress();
            
            DefaultMutableTreeNode all = new DefaultMutableTreeNode(c.miHuffman.raizArbol.letra);
            recorrer(c.miHuffman.raizArbol, all);
            
            JFrame frame = new JFrame ("arbol shet");
            frame.getContentPane().add(new JScrollPane(new JTree(all)));
            frame.setVisible(true);


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void recorrer(Nodo h, DefaultMutableTreeNode t) {


        if (h.hijoIzq != null) {

            DefaultMutableTreeNode tn = new DefaultMutableTreeNode(h.hijoIzq.letra);
            t.add(tn);
            recorrer(h.hijoIzq, tn);
        }

        //System.out.println("letra: " + h.letra + "\nfrecuencia: " + h.frecuencia + "\ncodigo: " + h.codigo);

        if (h.hijoDer != null) {
            DefaultMutableTreeNode tn = new DefaultMutableTreeNode(h.hijoDer.letra);
            t.add(tn);
            recorrer(h.hijoDer, tn);
        }
    }
}
