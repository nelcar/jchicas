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
public class ColasConArraysTest {

    public ColasConArraysTest() {
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
     * Test of addFirst method, of class ColasConArrays.
     */
    @Test
    public void testAddFirst() throws Exception {
        System.out.println("addFirst");
        Object value = null;
        ColasConArrays instance = new ColasConArrays();
        instance.addFirst(value);
    }

    /**
     * Test of removeLast method, of class ColasConArrays.
     */
    @Test
    public void testRemoveLast() throws Exception {
        System.out.println("removeLast");
        ColasConArrays instance = new ColasConArrays();
        Object expResult = "cosa";
        instance.addFirst("cosa");
        Object result = instance.removeLast();
        assertEquals(expResult, result);
    }

    /**
     * Test of peek method, of class ColasConArrays.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ColasConArrays instance = new ColasConArrays();
        Object expResult = "cosa";
        instance.addFirst("cosa");
        Object result = instance.peek();
        assertEquals(expResult, result);
    }

}