package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    Controller myController = new Controller();
    @Test
    @DisplayName("Correo OK y saldo OK(comprobacion regexp en dialogo)")
    void registrarCuenta1() throws CantidadInicialMenorOIgualQueCeroException {
        assertTrue(myController.registrarCuenta("correo@aRegistrar.com",1000f));
        assertTrue(myController.registrarCuenta("correo",1000f));
    }

    @Test
    @DisplayName("Comprobamos saldo en una cuenta que sabemos que existe")
    void consultarSaldo1() throws CantidadInicialMenorOIgualQueCeroException, CuentaNoExisteException {
        myController.registrarCuenta("c11@example.com",100f);
        assertEquals(myController.consultarSaldo("c11@example.com"),100f);
    }

    @Test
    @DisplayName("Comprobamos saldo en una cuenta que sabemos que NO existe")
    void consultarSaldo2() throws CantidadInicialMenorOIgualQueCeroException, CuentaNoExisteException {
        Exception e = assertThrows(Exception.class,()->{
            myController.consultarSaldo("c99@example.com");
        });
        assertEquals("La cuenta no existe",e.getMessage());
    }

    @Test
    @DisplayName("Ingreso en cuenta con valores OK")
    void ingresarDinero1() throws CantidadInicialMenorOIgualQueCeroException,
            CantidadInIntervaloValidoException,
            CuentaNoExisteException {
        float saldoAntesDeIngresar = 200f;
        float ingresoEnCuenta= 100f;
        myController.registrarCuenta("c21@example.com",saldoAntesDeIngresar);
        myController.ingresarDinero("c21@example.com",ingresoEnCuenta);
        assertEquals(myController.consultarSaldo("c21@example.com"),saldoAntesDeIngresar+ingresoEnCuenta);
    }

    @Test
    @DisplayName("Ingreso en cuenta inferior al minimo permitido")
    void ingresarDinero2() throws CantidadInicialMenorOIgualQueCeroException, CantidadInIntervaloValidoException, CuentaNoExisteException {
        float saldoAntesDeIngresar = 200f;
        float ingresoEnCuenta= 0.1f;
        myController.registrarCuenta("c22@example.com",saldoAntesDeIngresar);
        Exception e = assertThrows(Exception.class,()->{
            myController.ingresarDinero("c22@example.com",ingresoEnCuenta);
        });
        assertEquals("La cantidad debe estar entre 0.50 y 500",e.getMessage());

    }

    @Test
    @DisplayName("Ingreso en cuenta superior al limite permitido")
    void ingresarDinero3() throws CantidadInicialMenorOIgualQueCeroException, CantidadInIntervaloValidoException, CuentaNoExisteException {
        float saldoAntesDeIngresar = 200f;
        float ingresoEnCuenta= 600f;
        myController.registrarCuenta("c22@example.com",saldoAntesDeIngresar);
        Exception e = assertThrows(Exception.class,()->{
            myController.ingresarDinero("c22@example.com",ingresoEnCuenta);
        });
        assertEquals("La cantidad debe estar entre 0.50 y 500",e.getMessage());
    }

    @Test
    @DisplayName("Retirada con datos OK")
    void sacarDinero1() throws CantidadInicialMenorOIgualQueCeroException, CantidadMayorQueSaldoException, CantidadInIntervaloValidoException, CuentaNoExisteException {float saldoAntesDeIngresar = 200f;
        float retiradaEnCuenta= 100f;
        myController.registrarCuenta("c31@example.com",saldoAntesDeIngresar);
        myController.sacarDinero("c31@example.com",retiradaEnCuenta);
        assertEquals(myController.consultarSaldo("c31@example.com"),saldoAntesDeIngresar-retiradaEnCuenta);
    }

    @Test
    @DisplayName("Retirada superior al limite permitido")
    void sacarDinero2() throws CantidadInicialMenorOIgualQueCeroException, CantidadMayorQueSaldoException, CantidadInIntervaloValidoException, CuentaNoExisteException {float saldoAntesDeIngresar = 200f;
        float retiradaEnCuenta= 600f;
        //Omito que comprobar valores en la cuenta porque eso se comprueba al realizar una retirada en la clase cuenta.
        myController.registrarCuenta("c32@example.com",saldoAntesDeIngresar);
        Exception e = assertThrows(Exception.class,()->{
            myController.sacarDinero("c32@example.com",retiradaEnCuenta);
        });
        assertEquals("La cantidad debe estar entre 0.50 y 500",e.getMessage());
    }
    @Test
    @DisplayName("Retirada inferior al limite permitido")
    void sacarDinero3() throws CantidadInicialMenorOIgualQueCeroException, CantidadMayorQueSaldoException, CantidadInIntervaloValidoException, CuentaNoExisteException {float saldoAntesDeIngresar = 200f;
        float retiradaEnCuenta= 0.1f;
        //Omito que comprobar valores en la cuenta porque eso se comprueba al realizar una retirada en la clase cuenta.
        myController.registrarCuenta("c33@example.com",saldoAntesDeIngresar);
        Exception e = assertThrows(Exception.class,()->{
            myController.sacarDinero("c32@example.com",retiradaEnCuenta);
        });
        assertEquals("La cantidad debe estar entre 0.50 y 500",e.getMessage());
    }
    @Test
    @DisplayName("Test a mayores")
    @Disabled("Por si se me ocurre algo no comprobado")
    void sacarDinero4() throws CantidadInicialMenorOIgualQueCeroException, CantidadMayorQueSaldoException, CantidadInIntervaloValidoException, CuentaNoExisteException {float saldoAntesDeIngresar = 200f;
        float retiradaEnCuenta= 0.1f;
        //Omito que comprobar valores en la cuenta porque eso se comprueba al realizar una retirada en la clase cuenta.
        myController.registrarCuenta("c33@example.com",saldoAntesDeIngresar);
        Exception e = assertThrows(Exception.class,()->{
            myController.sacarDinero("c32@example.com",retiradaEnCuenta);
        });
        assertEquals("La cantidad debe estar entre 0.50 y 500",e.getMessage());
    }
}