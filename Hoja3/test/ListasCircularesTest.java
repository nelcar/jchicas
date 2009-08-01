
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


public class ListasCircularesTest {

    public ListasCircularesTest() {
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
     * Test of addFirst method, of class ListasCirculares.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object o = null;
        ListasCirculares instance = new ListasCirculares();
        instance.addFirst(o);
        
    }

    /**
     * Test of addLast method, of class ListasCirculares.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object o = null;
        ListasCirculares instance = new ListasCirculares();
        instance.addLast(o);
        
    }

    /**
     * Test of removeFirst method, of class ListasCirculares.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        ListasCirculares instance = new ListasCirculares();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHead method, of class ListasCirculares.
     */
    @Test
    public void testGetHead() {
        System.out.println("getHead");
        ListasCirculares instance = new ListasCirculares();
        Object expResult = null;
        Object result = instance.getHead();
        assertEquals(expResult, result);
        
    }

}