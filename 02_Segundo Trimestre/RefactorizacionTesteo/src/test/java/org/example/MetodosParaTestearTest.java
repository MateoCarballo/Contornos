package org.example;

import junit.framework.TestCase;

public class MetodosParaTestearTest extends TestCase {

    public void testCalcularDivision() throws Exception {
        MetodosParaTestear m = new MetodosParaTestear();
        assertEquals(3.4f, MetodosParaTestear.calcularDivision(8.5f, 2.5f));
    }

    public void testFactorial() throws Exception {
        MetodosParaTestear m = new MetodosParaTestear();
        assertEquals(24f, m.factorial((byte)4));
    }

    public void testBusca() {
        char[] arrayC={'z','x','y','a','b'};
        MetodosParaTestear m = new MetodosParaTestear();
        assertTrue(m.busca('a', arrayC));
    }

    public void testObtenerAcronimo() {
    }
}