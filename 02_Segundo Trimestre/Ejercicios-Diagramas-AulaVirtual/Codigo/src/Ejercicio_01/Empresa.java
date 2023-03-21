package Ejercicio_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entrada=2;

        int contadorId00=0;
        int contadorId01=0;

        int id=0;
        String nombre;
        int edad;
        long tfnoContacto;
        float salarioBruto;
        int categoria;

        Empleado employee = new Empleado();

        ArrayList<Empleado> misEmpleados=new ArrayList();
        ArrayList<Cliente> misClientes=new ArrayList<>();

        System.out.println("""
                Ejercicio 01 Contornos:
            
                Opciones:
                11.Añadir Empleado
                12.Mostrar Empleados
                13.Eliminar Empleado
                
                21.Añadir Cliente
                22.Mostrar Cliente
                23.Eliminar Cliente
                
                31.Añadir Directivo
                32.Mostrar Directivo
                33.Mostrar Subordinados
                34.Eliminar Directivo""");

        switch (entrada){
            case 11 -> {
                contadorId00++;
                System.out.println("Nombre?");
                nombre= br.readLine();
                System.out.println("Edad?");
                edad= Integer.parseInt(br.readLine());
                System.out.println("SalarioBruto?");
                salarioBruto=Float.parseFloat(br.readLine());

                Empleado.addEmployee(misEmpleados,contadorId00,nombre,edad,salarioBruto);

            }

            case 13->{
                System.out.println("ID del empleado a eliminar?");
                id=Integer.parseInt(br.readLine());
                /*
                Buscamos entre los elementos de la Arraylist el elemento que contenga un id como el que recogemos
                por teclado. Si es así podremos llamar al metodo que elimina el índice que le pasamos como parametro
                 */

                for (int i = 0; i < misEmpleados.size(); i++) {
                    employee=misEmpleados.get(i);
                    if(employee.getIdEmpleado()==id){
                        employee.deleteEmployee(misEmpleados,i);
                    }

                }
                employee.deleteEmployee(misEmpleados,id);
            }
            case 21->{
                contadorId00++;
                System.out.println("Nombre?");
                nombre= br.readLine();
                System.out.println("Edad?");
                edad= Integer.parseInt(br.readLine());
                System.out.println("Telefono de contacto?");
                tfnoContacto=Long.parseLong(br.readLine());
                Cliente.addCustomer(misClientes,contadorId00,nombre,edad,tfnoContacto);

            }
            case 31->{
                contadorId00++;
                System.out.println("Nombre?");
                nombre= br.readLine();
                System.out.println("Edad?");
                edad= Integer.parseInt(br.readLine());
                System.out.println("SalarioBruto?");
                salarioBruto=Float.parseFloat(br.readLine());
                System.out.println("Categoría?");
                categoria=Integer.parseInt(br.readLine());
                Directivo.addManagerial(misEmpleados,contadorId00,nombre,edad,salarioBruto,categoria);
            }
            case 34->{
                System.out.println("ID del directivo a eliminar?");
                id=Integer.parseInt(br.readLine());
                employee.deleteEmployee(misEmpleados,id);


            }
        }
    }

/*
//TODO Generalizar los metodos e incorporarlos a la clase correspondiente. Encapsular el código.

 public static void mostrarClientes(Cliente[] mostrarClientes){
        for (int i = 0; i < mostrarClientes.length-1 ; i++) {
            System.out.println(mostrarClientes[i]);
        }
    }
    public static void mostrarEmpleados(Empleado[] mostrarEmpleados){
        for (int i = 0; i < mostrarEmpleados.length-1; i++) {
            System.out.println(mostrarEmpleados[i]);
        }
    }
    public static void mostrarDirectivos(Directivo[] mostrarDirectivos){
        for (int i = 0; i < mostrarDirectivos.length; i++) {
            System.out.println(mostrarDirectivos[i]);
        }
    }
    public static void rellenarCampos(Cliente[] rellenarClientes){
        for (int i = 0; i < rellenarClientes.length; i++) {
            rellenarClientes[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarClientes[i].setEdad(Utilidades.numAleatorio(16,60));
            rellenarClientes[i].setTfnoContacto1(Utilidades.numAleatorio(986000000,986999999));
        }
    }
    public static void rellenarCampos(Directivo [] rellenarDirectivos){
        for (int i = 0; i < rellenarDirectivos.length; i++) {
            rellenarDirectivos[i].setNombre(Utilidades.plantillaNombres[Utilidades.numAleatorio(0,10)]);
            rellenarDirectivos[i].setEdad(Utilidades.numAleatorio(18,65));
            rellenarDirectivos[i].setSalarioBruto(Utilidades.numAleatorio((float) 35000.00,(float)50000.00));
            rellenarDirectivos[i].setCategoria(Utilidades.numAleatorio(1,10));
            rellenarDirectivos[i].setNumeroSubordinados(Utilidades.numAleatorio(1,10));
        }
        rellenarSubordinados(rellenarDirectivos);
    }
    public static void rellenarSubordinados(Directivo[] directivoss){
        String[] auxiliar= new String []
        for (int i = 0; i < directivoss.length; i++) {
            for (int j = 0; j < directivoss[i].getNumeroSubordinados(); j++) {


                // Pasar el vector de Empleados para poder sacar nombres de los Empleados que estén subordinados

                directivoss[i].nombresSubordinados[i];
            }
        }
    }
 */


}