package Ejercicio_01;

import java.util.ArrayList;

/**
 TODO public static Empleado crearEmpleado(String nombre, int edad, float salarioBruto) {
 falta meter las excepciones para evitar
 crear el empleado si algún valor no es correcto
 ahora mismo hace lo mismo que el constructor no evita
 crear un empleado aunque no rellenemos los campos porque los valores
 no están OK
 Empleado emp = new Empleado();
 if ((salarioBruto > 0) && (nombre.length() > 0) && (edad > 0)) {
 emp.setEdad(edad);
 emp.setNombre(nombre);
 emp.setSalarioBruto(salarioBruto);
 }
 return emp;
 }
 */


public class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected int edad;
    protected float salarioBruto;

    public Empleado(){

    }

    public Empleado(int idEmpleado, String nombre, int edad, float salarioBruto) {
        this.idEmpleado= idEmpleado;
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBruto = salarioBruto;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public static void addEmployee(ArrayList<Empleado> employes,int idEmpleado,String nombre, int edad,float salarioBruto){
        employes.add(new Empleado( idEmpleado,nombre, edad, salarioBruto));
    }

    public void deleteEmployee(ArrayList<Empleado> employes,int indice){
        //elimina de la 'ArrayList' de empleados el índice que pasamos como parámetro
        employes.remove(indice);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioBruto=" + salarioBruto +
                '}';
    }
}
