package org.example;

/**
 * Una vez recogida la informacion en la clase 'Dialog' la clase Controller se encarga de dirigir los datos
 * para llamar a los metodos necesarios para completar la operacion que requiere el usuario.
 */
public class Controller {
    private final Repository repository = new Repository();

    private static final float MIN_CANTIDAD_TRANSACCION = 0.50f;
    private static final float MAX_CANTIDAD_TRANSACCION = 500f;

    /**
     * Este metodo registra una cuenta tiene una comprobacion que asegura que el saldo no sea un numero negativo
     *
     *
     * @param emailRegistro
     * @param cantidadInicial
     * @return  retorna un booleano que nos indica si la operacion se ha realizado o no con exito
     * @throws CantidadInicialMenorOIgualQueCeroException
     */
    public boolean registrarCuenta(String emailRegistro, float cantidadInicial)
            throws CantidadInicialMenorOIgualQueCeroException {
        if (cantidadInicial <= 0) throw new CantidadInicialMenorOIgualQueCeroException();
        return repository.add(new Cuenta(emailRegistro, cantidadInicial));
    }

    /**
     *
     * @param email entra un email y lo busca en su Repository. Si encuentra la cuenta nos devuelve el objeto si no
     *              salta la excepcion
     * @return      Objeto Cuenta que coincuida con el email
     * @throws CuentaNoExisteException
     */
    public float consultarSaldo(String email) throws CuentaNoExisteException {
        Cuenta cuenta = repository.findByEmail(email);
        if (cuenta==null) throw new CuentaNoExisteException();
        else return cuenta.getSaldo();
    }

    /**
     *
     * @param emailOrigen email define la cuenta sobre la que operamos
     * @param cantidad cantedad a ingresar en la cuenta
     * @throws CantidadInicialMenorOIgualQueCeroException El propio nombre ya la identifica
     * @throws CantidadInIntervaloValidoException El propio nombre ya la identifica
     */
    public void ingresarDinero(String emailOrigen, float cantidad)
            throws CantidadInicialMenorOIgualQueCeroException, CantidadInIntervaloValidoException {
        if (cantidad <= 0) throw new CantidadInicialMenorOIgualQueCeroException();
        if ((cantidad < MIN_CANTIDAD_TRANSACCION) || (cantidad > MAX_CANTIDAD_TRANSACCION))
            throw new CantidadInIntervaloValidoException();
        repository.findByEmail(emailOrigen).sumarASaldo(cantidad);
    }


    /**
     *
     * @param emailDestino email define la cuenta sobre la que operamos
     * @param cantidad cantedad a ingresar en la cuenta
     * @throws CantidadInicialMenorOIgualQueCeroException El propio nombre ya la identifica
     * @throws CantidadInIntervaloValidoException El propio nombre ya la identifica
     * @throws CantidadMayorQueSaldoException El propio nombre ya la identifica
     */
    public void sacarDinero(String emailDestino, float cantidad)
            throws CantidadInicialMenorOIgualQueCeroException, CantidadInIntervaloValidoException,
            CantidadMayorQueSaldoException {
        if (cantidad <= 0) throw new CantidadInicialMenorOIgualQueCeroException();
        if ((cantidad < MIN_CANTIDAD_TRANSACCION) || (cantidad > MAX_CANTIDAD_TRANSACCION))
            throw new CantidadInIntervaloValidoException();
        repository.findByEmail(emailDestino).restarASaldo(cantidad);
    }


}
