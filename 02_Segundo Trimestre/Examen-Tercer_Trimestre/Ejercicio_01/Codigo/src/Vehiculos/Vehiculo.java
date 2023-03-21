package Vehiculos;

import java.util.ArrayList;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private ArrayList <Z_Accidente>   listadoAccidentes     =   new ArrayList();
    private ArrayList <Z_Reparacion>  listadoReparaciones  =   new ArrayList();

    public Vehiculo(String marca, String modelo, ArrayList<Z_Accidente> listadoAccidentes, ArrayList<Z_Reparacion> listadoReparaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.listadoAccidentes = listadoAccidentes;
        this.listadoReparaciones = listadoReparaciones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Z_Accidente> getListadoAccidentes() {
        return listadoAccidentes;
    }

    public void setListadoAccidentes(ArrayList<Z_Accidente> listadoAccidentes) {
        this.listadoAccidentes = listadoAccidentes;
    }

    public ArrayList<Z_Reparacion> getListadoReparaciones() {
        return listadoReparaciones;
    }

    public void setListadoReparaciones(ArrayList<Z_Reparacion> listadoReparaciones) {
        this.listadoReparaciones = listadoReparaciones;
    }
}
