package Vehiculos;

import java.time.LocalDate;

public class Z_Accidente {

    private LocalDate fechaAccidente;
    private byte gravedad;

    public Z_Accidente(LocalDate fechaAccidente, byte gravedad) {
        this.fechaAccidente = fechaAccidente;
        this.gravedad = gravedad;
    }

    public LocalDate getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(LocalDate fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public byte getGravedad() {
        return gravedad;
    }

    public void setGravedad(byte gravedad) {
        this.gravedad = gravedad;
    }
}
