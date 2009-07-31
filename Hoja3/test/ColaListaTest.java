/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
public class ColaListaTest {

    public ColaListaTest() {
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
     * Test of removeLast method, of class ListQueue.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        ColaLista instance = new ColaLista();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class ListQueue.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ColaLista instance = new ColaLista();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class ListQueue.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object q = null;
        ColaLista instance = new ColaLista();
        instance.addFirst(q);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}