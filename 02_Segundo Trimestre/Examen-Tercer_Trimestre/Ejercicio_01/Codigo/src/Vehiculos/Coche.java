package Vehiculos;

import java.util.ArrayList;

public class Coche extends VehiculoMotor{

    private String tipodeCombustible;
    private String numerodePlazas;

    public Coche(String marca, String modelo, ArrayList<Z_Accidente> listadoAccidentes, ArrayList<Z_Reparacion> listadoReparaciones, String matricula, String tipodeCombustible, String numerodePlazas) {
        super(marca, modelo, listadoAccidentes, listadoReparaciones, matricula);
        this.tipodeCombustible = tipodeCombustible;
        this.numerodePlazas = numerodePlazas;
    }

    public String getTipodeCombustible() {
        return tipodeCombustible;
    }

    public void setTipodeCombustible(String tipodeCombustible) {
        this.tipodeCombustible = tipodeCombustible;
    }

    public String getNumerodePlazas() {
        return numerodePlazas;
    }

    public void setNumerodePlazas(String numerodePlazas) {
        this.numerodePlazas = numerodePlazas;
    }
}
