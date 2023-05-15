package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionesTest {

    @Test
    @DisplayName("Con datos Ok devuelve False (el email no es invalido)")
    void isEmailInValido1() {
        assertFalse(Validaciones.isEmailInValido("miEmailEsBueno@correo.com"));
    }

    @Test
    @DisplayName("Con datos NO Ok devuelve True (el email es invalido)")
    void isEmailInValido2() {
        assertTrue(Validaciones.isEmailInValido("!!!!@correo.com"));
    }
    @Test
    @DisplayName("Comprobar - parte local (al menos una letra)")
    void isEmailInValido3() {
        assertFalse(Validaciones.isEmailInValido("a@correo.com"));
    }
    @Test
    @DisplayName("Comprobar arroba")
    void isEmailInValido4() {
        assertTrue(Validaciones.isEmailInValido("acorreo.com"));
    }
    @Test
    @DisplayName("Comprobar dominio (al menos dos letras")
    void isEmailInValido5() {
        assertTrue(Validaciones.isEmailInValido("abc@d.com"));
    }
    @Test
    @DisplayName("Comprobar dominio un punto")
    void isEmailInValido6() {
        assertTrue(Validaciones.isEmailInValido("abc@dcom"));
    }
    @Test
    @DisplayName("Comprobar dominio un punto y al menos otras dos letras")
    void isEmailInValido7() {
        assertTrue(Validaciones.isEmailInValido("abc@dd.c"));
    }
    @Test
    @DisplayName("Comprobar dominio - el guion no puede estar al principio o final " +
            "de la parte de domino, ni después del punto no puede haber dos puntos consecutivos")
    void isEmailInValido8() {
        assertAll(
                () -> assertTrue(Validaciones.isEmailInValido("_abc@dd.c")),
                () -> assertTrue(Validaciones.isEmailInValido("abc_@dd.c")),
                () -> assertTrue(Validaciones.isEmailInValido("abc@dd..."))
        );

    }


}