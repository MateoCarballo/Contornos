package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatesTest {

    @Test
    @DisplayName("Dividendo y divisor -> Valor mínimo")
    void calcularDivision() throws Exception {
       float resultado= Mates.calcularDivision(Float.MIN_VALUE,Float.MIN_VALUE);
        assertEquals(1F, resultado);
    }

    //Disabled es el T0D0 de los test no ejecuta este test salvo que lo hagamos a mano
    @Test
    @DisplayName("Dividendo y divisor -> Valor Maximo y Minimo")
    @Disabled("Revisar valores maximos y minimos de especificaciones")
    void calcularDivisionMAxMin() throws Exception {
        float resultado= Mates.calcularDivision(Float.MAX_VALUE,Float.MIN_VALUE);
        assertEquals(2.4283E+83, resultado);
    }

    @Test
    @DisplayName("Dividendo y divisor -> Dividir cero por valor minimo")
    void calcularDivisionCero() throws Exception {
        assertEquals(0F,Mates.calcularDivision(0F,Float.MIN_VALUE));
    }

    @Test
    void testExcepcion(){
        //Esto te lo crees y punto funciones lamba pasas la funcion para comprobar que rompa
        Exception e = Assertions.assertThrows(Exception.class,()->{
            Mates.calcularDivision(1,0);
        });
        assertEquals("Error. El divisor no puede ser 0",e.getMessage());
    }

    @Test
    void factorial() {
    }
}