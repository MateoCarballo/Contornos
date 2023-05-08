Tarea sobre código simple: refactorización, documentación y testeo
Crear un proyecto con las siguientes funcionalidades.
Refactorizar y documentar el código. Generar JavaDoc.
Diseñar pruebas unitarias para testear el código.


Funcionalidades de partida:

1. Método calcularDivision del proyecto_division.

Recibe un dividendo y un divisor de tipo float y devuelve el resultado de la división también de tipo float siempre que el divisor no sea 0, en cuyo caso generará una excepción.

package proyecto_division;


    public class Division {
        public float calcularDivision(float dividendo, float divisor) throws Exception {

            if (divisor == 0) {

                throw (new Exception("Error. El divisor no puede ser 0."));

            }

            float resultado = dividendo / divisor;

            return resultado;

        }

    }



2. Método factorial del proyecto_factorial.

Recibe un número n de tipo byte y devuelve  su factorial de tipo float excepto en el caso de que sea negativo, en cuyo caso genera una excepción. El factorial de un número n es el producto de todos los números menores que él hasta el número 2. Casos especiales del factorial son factorial(0)=1 y factorial(1)=1.


package proyecto_factorial;



    public class Factorial {
        public float factorial(byte n) throws Exception {
            if (n < 0) {
                throw new Exception("Error. El número tiene que ser >=0");
            }
            float resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }


3. Método busca del proyecto_arrays.

Recibe un carácter c y un array de caracteres v de 10 elementos como máximo ordenados de forma ascendente. Devuelve el valor booleano true o false según encuentre el carácter en el array o no. La búsqueda es dicotómica, es decir, la primera busca se hace teniendo en cuenta todo el array pero en las siguientes sólo se tiene en cuenta un segmento del obtenido mediante el cálculo del índice mitad del segmento y la comparación de c con el elemento almacenado en ese índice; si coincide, finaliza la búsqueda y se encuentra el carácter en el array; si c é menor, el siguiente segmento será la primera mitad del actual; si c es mayor, o siguiente segmento será a segunda mitad del actual. Si este proceso finaliza con un segmento nulo y no se encontró el carácter es que no existe.

package buscarcaracter;

    public class OperacionsArrays {
        public boolean busca(char c, char[] v) {
            int a, z, m;
            a = 0;
            z = v.length - 1;
            boolean resultado=false;
            while (a <= z && resultado==false) {
                m = (a + z) / 2;
                if (v[m] == c) {
                    resultado=true;
                }else{
                    if (v[m] < c) {
                        a = m + 1;
                    }
                    else{
                        z = m - 1;
                    }
                }
            }
            return resultado;
        }
    }


4. Método obtenerAcronimo del proyecto_acronimo.

Recibe una cadena de caracteres y retorna una cadena con el acrónimo correspondiente.
El acrónimo está formado por el primer carácter de cada palabra seguidos 
de un punto cuando el carácter es diferente de espacio en blanco.

package proyecto_acronimos;

    public class Acronimos {
        public String obtenerAcronimo(String cadena){
            String resultado="";
            char caracter;
            int n=cadena.length();
            for(int i=0;i<n;i++){
                caracter=cadena.charAt(i);
                if(caracter!=' '){
                    if (i==0){
                        resultado=resultado+caracter+'.';
                    }else{
                        if(cadena.charAt(i-1)==' '){
                            resultado=resultado+caracter+'.';
                        }
                    }
                }
            }
            return resultado;
        }
    }

