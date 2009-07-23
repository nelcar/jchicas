/*
 * Universidad del Valle de Guatemala
 * Autor: Julio R. Chicas Sett
 * Programa:  NewMain.java
 * Descripcion: Clase de prueba de newmaintest.java
 * Seccion:
 * Algoritmo y estructura de datos
 */

/**
 * Se importan paquetes
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NewMainTest {

    public NewMainTest() {
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
     * Test of main method, of class NewMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}