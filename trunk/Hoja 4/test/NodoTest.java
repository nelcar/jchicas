/*Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas Sett
 * Carne:07470
 * Descripcion: junit de la clase NodoTest
 * Programa: NodoTest.java
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
public class NodoTest {

    public NodoTest() {
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
     * Test of setCodigo method, of class Nodo.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Nodo instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getHijoIzq method, of class Nodo.
     */
    @Test
    public void testGetHijoIzq() {
        System.out.println("getHijoIzq");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.getHijoIzq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setHijoIzq method, of class Nodo.
     */
    @Test
    public void testSetHijoIzq() {
        System.out.println("setHijoIzq");
        Nodo hijoIzq = null;
        Nodo instance = null;
        instance.setHijoIzq(hijoIzq);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getHijoDer method, of class Nodo.
     */
    @Test
    public void testGetHijoDer() {
        System.out.println("getHijoDer");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.getHijoDer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHijoDer method, of class Nodo.
     */
    @Test
    public void testSetHijoDer() {
        System.out.println("setHijoDer");
        Nodo hijoDer = null;
        Nodo instance = null;
        instance.setHijoDer(hijoDer);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getDerecha method, of class Nodo.
     */
    @Test
    public void testGetDerecha() {
        System.out.println("getDerecha");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.getDerecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDerecha method, of class Nodo.
     */
    @Test
    public void testSetDerecha() {
        System.out.println("setDerecha");
        Nodo derecha = null;
        Nodo instance = null;
        instance.setDerecha(derecha);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getIzquierda method, of class Nodo.
     */
    @Test
    public void testGetIzquierda() {
        System.out.println("getIzquierda");
        Nodo instance = null;
        Nodo expResult = null;
        Nodo result = instance.getIzquierda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setIzquierda method, of class Nodo.
     */
    @Test
    public void testSetIzquierda() {
        System.out.println("setIzquierda");
        Nodo izquierda = null;
        Nodo instance = null;
        instance.setIzquierda(izquierda);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getLetra method, of class Nodo.
     */
    @Test
    public void testGetLetra() {
        System.out.println("getLetra");
        Nodo instance = null;
        char expResult = ' ';
        char result = instance.getLetra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setLetra method, of class Nodo.
     */
    @Test
    public void testSetLetra() {
        System.out.println("setLetra");
        char letra = ' ';
        Nodo instance = null;
        instance.setLetra(letra);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFrecuencia method, of class Nodo.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Nodo instance = null;
        int expResult = 0;
        int result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setFrecuencia method, of class Nodo.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        int frecuencia = 0;
        Nodo instance = null;
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCodigo method, of class Nodo.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Nodo instance = null;
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isTipo method, of class Nodo.
     */
    @Test
    public void testIsTipo() {
        System.out.println("isTipo");
        Nodo instance = null;
        boolean expResult = false;
        boolean result = instance.isTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTipo method, of class Nodo.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        boolean tipo = false;
        Nodo instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
         
    }

}