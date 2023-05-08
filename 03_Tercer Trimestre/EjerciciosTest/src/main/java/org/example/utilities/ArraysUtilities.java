package org.example.utilities;

/**
 * Esta clase contiene metodos recurrentes sobre Arrays y Strings
 */
public final class ArraysUtilities {
    private ArraysUtilities(){}


    /**
     * @param c Carácter que buscamos en la matriz de caracteres.
     * @param v Matriz de caracteres sobre el que vamos a buscar
     * @return Devuelve si el caracter está contentido en la matriz.
     */
    public static boolean buscarCaracteresEnArray(char c, char[] v) {
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

