package org.example;

/**
 * Esta clase contiene varios metodos recurrentes de uso comun relacionado con operaciones matemáticas.
 */
public final class Mates {
    /**
     * Constructor privado para que no podamos instanciar ningun objeto de esta clase.
     */
    private Mates() {
    }
    //SI DENTRO DEL METODO VAS A ACCEDER ATRIBUTOS DE LA CLASE DEBERIA NO SER ESTATICO
    //Usamos final y no abstract para que no pueda heredar de ella ninguna otra

    /**
     * @param dividendo
     * @param divisor
     * @return Este metodo tiene dos parametros de entrada y nos devuelve el resultado de la división.
     * @throws Exception
     */
    public static float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) throw (new Exception("Error. El divisor no puede ser 0."));
        return dividendo / divisor;
    }
    /**
     * @param n numero del que vamos a calcular su factorial.
     * @return Devuelve el resultado de calcular el factorial de 'n'.
     * @throws Exception
     */
    public static float factorial(byte n) throws Exception {
        if (n < 0) throw new Exception("Error. El número tiene que ser >=0");
        float resultado = 1;
        for (int i = 2; i <= n; i++) resultado *= i;
        return resultado;
    }

}
