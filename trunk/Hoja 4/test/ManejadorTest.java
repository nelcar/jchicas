/*Universidad del Valle de Guatemala
 * Algoritmos y estructura de Datos
 * Julio Chicas Sett
 * Carne:07470
 * Descripcion:junit de la clase manejadortest
 * Programa: ManejadorTest.java
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
public class ManejadorTest {

    public ManejadorTest() {
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
     * Test of compress method, of class Manejador.
     */
    @Test
    public void testCompress() throws Exception {
        System.out.println("compress");
        Manejador instance = null;
        instance.compress();
        // TODO review the generated test code and remove the default call to fail.
        
    }

}