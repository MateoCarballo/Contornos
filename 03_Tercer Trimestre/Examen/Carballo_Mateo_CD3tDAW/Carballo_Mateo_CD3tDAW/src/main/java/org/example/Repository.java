package org.example;

import java.util.*;

/**
 * Esta clase contendrá un ArrayList para silmular una DB.
 * Todas las operaciones que se piden desde controller se ejecutan aqui.
 */
public class Repository {


    private final List<Cuenta> baseDeDatos = new ArrayList<>();

    public List<Cuenta> getBaseDeDatos() {
        return baseDeDatos;
    }

    /**
     * Metodo encargado de añadir cuentas a la DB. El metodo comprueba que el email no haya sido registrado
     * @param cuenta Compuesta por email y saldo
     * @return Nos devuelve true si consigue añadir si devuelve false es que el email ya existe
     */
    public boolean add(Cuenta cuenta) {
        if (findByEmail(cuenta.getEmail())!=null) return false;
        else return baseDeDatos.add(cuenta);
    }

    /**
     *
     * @param email email del usuario que queremos encontrar
     * @return nos devuelve la cuenta entera como objeto de tipo Cuenta
     */
    public Cuenta findByEmail(String email) {
        return baseDeDatos.stream().filter(e -> e.getEmail().equals(email)).findAny().orElse(null);
    }

}
