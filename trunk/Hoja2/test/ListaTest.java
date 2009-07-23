/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  ListaTest.java
 * Descripcion: Clase de prueba de listatest.java
 * Seccion:
 * Algoritmo y estructura de datos
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
public class ListaTest {

    public ListaTest() {
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
     * Test of isEmpty method, of class Lista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class Lista.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Lista.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Lista.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object push = null;
        Lista instance = new Lista();
        instance.push(push);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVec method, of class Lista.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        int i = 0;
        Lista instance = new Lista();
        String expResult = "";
        String result = instance.getVec(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Lista.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int a = 0;
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.sacar(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}