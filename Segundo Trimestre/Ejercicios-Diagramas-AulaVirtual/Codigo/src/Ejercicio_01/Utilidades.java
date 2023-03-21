package Ejercicio_01;

public class Utilidades {
    final static String [] plantillaNombres= {
            "Alvaro","Beatriz","Carmen","Diego","Elena","Hugo", "Isabel","Luis","Martin","Teresa","María"};
            // 0         1         2        3      4       5      6         7       8        9       10
    public static float numAleatorio(float limInferior, float limSuperior){
        float aleatorio = (float)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static int numAleatorio(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static long numAleatorio(long limInferior, long limSuperior){
        long aleatorio = (long)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
	//TODO cambiar String por datos de tipo empleado. mas metodo add subordinate
}
