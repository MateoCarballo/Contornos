import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    }
    public static void generarMecanicos () {
        String[] nombresMecanicos = {"Juan", "María", "Pedro", "Lucía",
                "Federico", "Laura", "Gonzalo", "Ana", "Carlos", "Marta"};

        Mecanico[] mecanicos = new Mecanico[10];

        for (int i = 0; i < mecanicos.length; i++) {
            mecanicos[i] = new Mecanico(i + 1, nombresMecanicos[i], i + 1, LocalDate.now());
        }
    }
}