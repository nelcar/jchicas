/*Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas Sett
 * Carne:07470
 * Descripcion: junit de la clase de huffman
 * Programa: Huffamntest.java
 *
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jchicas
 */
public class HuffmanTest {

    public HuffmanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of agregarElemento method, of class Huffman.
     */
    @Test
    public void testAgregarElemento() {
        System.out.println("agregarElemento");
        Nodo miNodo = null;
        Huffman instance = null;
        instance.agregarElemento(miNodo);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of ordenar method, of class Huffman.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        Huffman instance = null;
        instance.ordenar();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of generarArbol method, of class Huffman.
     */
    @Test
    public void testGenerarArbol() {
        System.out.println("generarArbol");
        Huffman instance = null;
        instance.generarArbol();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ubicarNodo method, of class Huffman.
     */
    @Test
    public void testUbicarNodo() {
        System.out.println("ubicarNodo");
        Nodo miNodo = null;
        Nodo aux2 = null;
        Huffman instance = null;
        Nodo expResult = null;
        Nodo result = instance.ubicarNodo(miNodo, aux2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of generarCodigo method, of class Huffman.
     */
    @Test
    public void testGenerarCodigo() {
        System.out.println("generarCodigo");
        Nodo miNodo = null;
        String cadena = "";
        Huffman instance = null;
        instance.generarCodigo(miNodo, cadena);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCodigo method, of class Huffman.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        byte valor = 0;
        Huffman instance = null;
        String expResult = "";
        String result = instance.getCodigo(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTabla method, of class Huffman.
     */
    @Test
    public void testGetTabla() {
        System.out.println("getTabla");
        Huffman instance = null;
        byte[][] expResult = null;
        byte[][] result = instance.getTabla();
       
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTamano method, of class Huffman.
     */
    @Test
    public void testGetTamano() {
        System.out.println("getTamano");
        Huffman instance = null;
        int expResult = 0;
        int result = instance.getTamano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}