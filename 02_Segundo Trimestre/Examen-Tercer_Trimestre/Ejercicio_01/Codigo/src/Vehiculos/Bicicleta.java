package Vehiculos;

import java.util.ArrayList;

public class Bicicleta extends Vehiculo{

    private String numerodeSerie;

    public Bicicleta(String marca, String modelo, ArrayList<Accidente> listadoAccidentes, ArrayList<Reparacion> listadoReparaciones, String numerodeSerie) {
        super(marca, modelo, listadoAccidentes, listadoReparaciones);
        this.numerodeSerie = numerodeSerie;
    }

    public String getNumerodeSerie() {
        return numerodeSerie;
    }

    public void setNumerodeSerie(String numerodeSerie) {
        this.numerodeSerie = numerodeSerie;
    }
}
