package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Retirada < Saldo")
    void restarASaldo1() throws CantidadMayorQueSaldoException {
        Cuenta c = new Cuenta("c@email.com",1000f);
        float saldoAnterior = c.getSaldo();
        float retirada = 100f;
        c.restarASaldo(retirada);
        assertEquals(c.getSaldo(),saldoAnterior-retirada);
    }
    @Test
    @DisplayName("Retirada = Saldo")
    void restarASaldo2() throws CantidadMayorQueSaldoException {
        Cuenta c = new Cuenta("c@email.com",1000f);
        float saldoAnterior = c.getSaldo();
        float retirada = c.getSaldo();
        c.restarASaldo(retirada);
        assertEquals(c.getSaldo(),0);
    }
    @Test
    @DisplayName("Retirada > Saldo")
    void restarASaldo3() throws CantidadMayorQueSaldoException {
        Cuenta c = new Cuenta("c@email.com",1000f);
        float retirada = 1500f;
        Exception e = assertThrows(Exception.class,()->{
            c.restarASaldo(retirada);
        });
        assertEquals("No hay suficiente saldo para realizar esta transacción",e.getMessage());
    }
    @Test
    @DisplayName("Comprobando que acepta valores ok")
    void sumarASaldo1() {
        Cuenta c = new Cuenta("c@email.com",1000);
        float saldoAnterior = c.getSaldo();
        float saldoASumar = 100f;
        c.sumarASaldo(saldoASumar);
        assertEquals(c.getSaldo(),saldoAnterior+saldoASumar);
    }
    @Test
    @DisplayName("Comprobando que NO acepta valores NO ok,menores de cero")
    @Disabled("Pendiente refactorizar codigo")
    void sumarASaldo2() {
        Cuenta c = new Cuenta("c@email.com",0);
        float saldoAnterior = c.getSaldo();
        float saldoASumar = -100f;
        c.sumarASaldo(saldoASumar);
        assertEquals(c.getSaldo(),saldoAnterior+saldoASumar);
    }

}