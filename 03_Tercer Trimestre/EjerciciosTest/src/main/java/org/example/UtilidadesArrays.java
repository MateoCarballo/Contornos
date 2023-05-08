package org.example;

/**
 * Esta clase contiene metodos recurrentes sobre Arrays y Strings
 */
public final class UtilidadesArrays {
    private UtilidadesArrays(){}

    /**
     *
     * @param cadena
     * @return Devuleve el acronimo de la cadena que pasamos al método.
     */
    public static String obtenerAcronimo(String cadena) {
        String resultado = "";
        char caracter;
        int n = cadena.length();
        for (int i = 0; i < n; i++) {
            caracter = cadena.charAt(i);
            if (caracter != ' ') if (i == 0) resultado = resultado + caracter + '.';
            else if (cadena.charAt(i - 1) == ' ') resultado = resultado + caracter + '.';
        }
        return resultado;
    }


    /**
     * @param c Carácter que buscamos en la matriz de caracteres.
     * @param v Matriz de caracteres sobre el que vamos a buscar
     * @return Devuelve si el caracter está contentido en la matriz.
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

