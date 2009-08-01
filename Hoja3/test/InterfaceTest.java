

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas
 * Carne 07470
 *
 */
public class InterfaceTest {

    public InterfaceTest() {
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
     * Test of addFirst method, of class Interface.
     */
    @Test
    public void testAddFirst() throws Exception {
        System.out.println("addFirst");
        Object value = null;
        Interface instance = new InterfaceImpl();
        instance.addFirst(value);
        
    }

    /**
     * Test of removeLast method, of class Interface.
     */
    @Test
    public void testRemoveLast() throws Exception {
        System.out.println("removeLast");
        Interface instance = new InterfaceImpl();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of peek method, of class Interface.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        Interface instance = new InterfaceImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        
    }

    public class InterfaceImpl extends Interface {

        public void addFirst(E value) throws ColaLLenaException {
        }

        public E removeLast() throws ColaVaciaException {
            return null;
        }

        public E peek() throws ColaVaciaException {
            return null;
        }
    }

}