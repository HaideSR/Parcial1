/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haide
 */
public class Examen1Test {
    Examen1 operacion;
    public Examen1Test() {
        operacion = new Examen1();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of main method, of class Examen1.
     */
    @Test
    public void opcion1() {
        String resultado = operacion.obtenerAccion(true);
        assertEquals("yamatriculado", resultado);
    }
    
}
