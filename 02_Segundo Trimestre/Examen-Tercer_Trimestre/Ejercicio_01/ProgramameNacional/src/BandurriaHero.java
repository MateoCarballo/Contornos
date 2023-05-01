import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BandurriaHero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.parseInt(br.readLine());
        for (int i = 0; i <casos; i++) {
            int puntuacionAcumuladaTotal=0;
            String[] entradaTeclado = br.readLine().split("\\.");
            //Comprobar que valores se introducen por teclado
            for (int j = 0; j < entradaTeclado.length ; j++) {
                int puntuacionSiguiente=10;
                int puntuacionAcumuladaParcial=0;
                for (int k = 0; k <entradaTeclado[j].length() ; k++) {
                    if((entradaTeclado[j].charAt(k)=='o')||(entradaTeclado[j].charAt(k)=='O')){
                        puntuacionAcumuladaParcial+=puntuacionSiguiente;
                        puntuacionSiguiente+=10;
                    }
                }
                puntuacionAcumuladaTotal+=puntuacionAcumuladaParcial;
            }
            System.out.println(puntuacionAcumuladaTotal);
        }

    }
}