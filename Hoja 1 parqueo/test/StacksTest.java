/*
 * Universidad del Valle de Guatemala
 * Autor: Julio r. Chias Sett
 * Programa:  StacksTest.java
 * Descripcion: Clase que posee pruebas de junit
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
public class StacksTest {

    public StacksTest() {
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
     * Test of pointer method, of class Stacks.
     */
    @Test
    public void testPointer() {
        System.out.println("pointer");
        Stacks instance = new Stacks();
        int expResult = 0;
        int result = instance.pointer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class Stacks.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stacks instance = new Stacks();
        String expResult = "";
        String result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class Stacks.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        Stacks instance = new Stacks();
        String expResult = "";
        String result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Stacks.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String s = "";
        Stacks instance = new Stacks();
        instance.push(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVec method, of class Stacks.
     */
    @Test
    public void testGetVec() {
        System.out.println("getVec");
        int i = 0;
        Stacks instance = new Stacks();
        String expResult = "";
        String result = instance.getVec(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}