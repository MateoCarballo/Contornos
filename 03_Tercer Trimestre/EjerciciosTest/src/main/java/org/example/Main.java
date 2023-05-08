package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws Exception {

    }
/*
package org.example;

import junit.framework.TestCase;

public class MetodosParaTestearTest extends TestCase {

    public void testCalcularDivision() throws Exception {

        assertEquals(3.4f, MetodosParaTestear.calcularDivision(8.5f, 2.5f));
    }

    public void testFactorial() throws Exception {

        assertEquals(24f, MetodosParaTestear.factorial((byte)4));
    }

    public void testBusca() {
        char[] arrayC={'z','x','y','a','b'};
        assertTrue(MetodosParaTestear.busca('a', arrayC));
    }

    public void testObtenerAcronimo() {
    }
}



###############################


package org.example;

public final class MetodosParaTestear {

    //Constructor privado para que no se pueda instranciar
    private MetodosParaTestear(){}

    //SI DENTRO DEL METODO VAS A ACCEDER ATRIBUTOS DE LA CLASE DEBERIA NO SER ESTATICO
    //Usamos final y no abstract para que no pueda heredar de ella ninguna otra

    public static float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) throw (new Exception("Error. El divisor no puede ser 0."));
        return dividendo / divisor;
    }

    public static float factorial(byte n) throws Exception {
        if (n < 0) throw new Exception("Error. El número tiene que ser >=0");
        float resultado = 1;
        for (int i = 2; i <= n; i++) resultado *= i;
        return resultado;
    }

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
}
 */
}