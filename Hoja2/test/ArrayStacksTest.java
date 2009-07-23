/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  ArrayStacks.java
 * Descripcion: Clase que representa la prueba
 * Seccion:
 * Algoritmo y estructura de datos
 */

/**
 *
 * Se importan paquetes
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArrayStacksTest {

    public ArrayStacksTest() {
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
     * Test of push method, of class ArrayStacks.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object push = null;
        ArrayStacks instance = new ArrayStacks();
        instance.push(push);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of pop method, of class ArrayStacks.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayStacks instance = new ArrayStacks();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of peek method, of class ArrayStacks.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ArrayStacks instance = new ArrayStacks();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    /**
     * Test of isEmpty method, of class ArrayStacks.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayStacks instance = new ArrayStacks();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getVec method, of class ArrayStacks.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        int i = 0;
        ArrayStacks instance = new ArrayStacks();
        String expResult = "";
        String result = instance.getVec(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of sacar method, of class ArrayStacks.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int a = 0;
        ArrayStacks instance = new ArrayStacks();
        Object expResult = null;
        Object result = instance.sacar(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}