package org.example;

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
     * @return el cociente de la division
     * @throws Exception
     */
    public static float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) throw (new Exception("Error. El divisor no puede ser 0."));
        return dividendo / divisor;
    }

    /**
     * @param n
     * @return
     * @throws Exception
     */

    public static float factorial(byte n) throws Exception {
        if (n < 0) throw new Exception("Error. El número tiene que ser >=0");
        float resultado = 1;
        for (int i = 2; i <= n; i++) resultado *= i;
        return resultado;
    }

    /**
     * @param c
     * @param v
     * @return
     */
    public static boolean busca(char c, char[] v) {
        int a, z, m;
        a = 0;
        z = v.length - 1;
        boolean resultado = false;
        while (a <= z && resultado == false) {
            m = (a + z) / 2;
            if (v[m] == c) resultado = true;
            else if (v[m] < c) a = m + 1;
            else z = m - 1;
        }
        return resultado;
    }
}
