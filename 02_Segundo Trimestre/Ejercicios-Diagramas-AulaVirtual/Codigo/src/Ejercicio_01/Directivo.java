package Ejercicio_01;

import java.util.ArrayList;

public class Directivo extends Empleado {

    private int categoria;

    private ArrayList<Empleado> subordinados =new ArrayList();

    public Directivo(int idEmpleado, String nombre, int edad, float salarioBruto, int categoria) {
        super(idEmpleado,nombre, edad, salarioBruto);
        this.categoria = categoria;
    }
    public static void addManagerial(ArrayList<Empleado> employes, int id,String nombre,int edad, float salarioBruto,int categoria){
        employes.add(new Directivo(id,nombre,edad, salarioBruto,categoria));
    }

    public void deleteManagerial(ArrayList<Empleado> employes, int id){
        /*
        Pido el ID a la superclase de esta y si elimino la posicion
        donde coincidan.
        Lo eliminamos de nuestra arrayList
         */
        for (int i = 0; i < employes.size() ; i++) {
            if(super.getIdEmpleado()==id){
                employes.remove(i);
            }
        }
    }



    @Override
    public String toString() {
        super.toString();
        return "Directivo{" +
                "categoria=" + categoria +
                ", nombresSubordinados=" + subordinados +
                '}';
    }
}
