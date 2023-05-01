package org.example;

import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularDivision() throws Exception {
        //TODO tengo la duda de como asegurarme de que salta la excepción,
        // entiendo que en este caso es muy simple entiendo que asi no esta bien
        Assertions.assertEquals(Main.calcularDivision(34.56f,2.16f),16.00f);
        // Assertions.assertEquals(Main.calcularDivision(34.56f,0f),"Error. El número tiene que ser >=0");
    }

    @org.junit.jupiter.api.Test
    void factorial() throws Exception {
    Assertions.assertEquals(Main.factorial((byte)5),120f);
    }

    @org.junit.jupiter.api.Test
    void busca() {
        char abecedario[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < abecedario.length; i++) {
            Assertions.assertTrue(Main.busca(abecedario[i],abecedario));
        }

    }

    @org.junit.jupiter.api.Test
    void obtenerAcronimo() {
        String name0 = "Mateo Carballo Alonso";
        String name1 = "Angel Carballo Iglesias";
        Assertions.assertEquals("M.C.A.",Main.obtenerAcronimo(name0));
        Assertions.assertEquals("A.C.I.",Main.obtenerAcronimo(name1));
    }
}