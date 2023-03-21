package Vehiculos;

import java.time.LocalDate;

public class Z_Reparacion {
    private LocalDate fechaReparacion;
    private boolean resultadoReparacion;

    public Z_Reparacion(LocalDate fechaReparacion, boolean resultadoReparacion) {
        this.fechaReparacion = fechaReparacion;
        this.resultadoReparacion = resultadoReparacion;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public boolean isResultadoReparacion() {
        return resultadoReparacion;
    }

    public void setResultadoReparacion(boolean resultadoReparacion) {
        this.resultadoReparacion = resultadoReparacion;
    }


}
