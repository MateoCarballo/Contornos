package org.example;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repository= new Repository();;
    @BeforeEach
    void setUp() {

        Cuenta c1 = new Cuenta("c1@mail.com",100);
        repository.add(c1);
    }
    @org.junit.jupiter.api.Test
    @DisplayName("Anhadir una cuenta, comprobar que se coloca en la posicion correcta")
    void add() {
        Cuenta c2 = new Cuenta("c2@mail.com",200);
        repository.add(c2);
        ArrayList<Cuenta> listadoCuentas= (ArrayList<Cuenta>) repository.getBaseDeDatos();
        assertEquals(listadoCuentas.get(1).getEmail(),c2.getEmail());
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Localiza cuenta por Email.Cuenta que sabemos que existe")
    void findByEmail() {
        ArrayList<Cuenta> listadoCuentas= (ArrayList<Cuenta>) repository.getBaseDeDatos();
        Cuenta cuentaPosCero= listadoCuentas.get(0);
        assertEquals(repository.findByEmail(listadoCuentas.get(0).getEmail()),cuentaPosCero);
    }
}