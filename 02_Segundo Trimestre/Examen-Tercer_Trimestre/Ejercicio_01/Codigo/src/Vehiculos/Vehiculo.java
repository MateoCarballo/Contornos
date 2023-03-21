package Vehiculos;

import java.util.ArrayList;

public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private ArrayList <Accidente>   listadoAccidentes     =   new ArrayList();
    private ArrayList <Reparacion>  listadoReparaciones  =   new ArrayList();

    public Vehiculo(String marca, String modelo, ArrayList<Accidente> listadoAccidentes, ArrayList<Reparacion> listadoReparaciones) {
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

    public ArrayList<Accidente> getListadoAccidentes() {
        return listadoAccidentes;
    }

    public void setListadoAccidentes(ArrayList<Accidente> listadoAccidentes) {
        this.listadoAccidentes = listadoAccidentes;
    }

    public ArrayList<Reparacion> getListadoReparaciones() {
        return listadoReparaciones;
    }

    public void setListadoReparaciones(ArrayList<Reparacion> listadoReparaciones) {
        this.listadoReparaciones = listadoReparaciones;
    }
}
