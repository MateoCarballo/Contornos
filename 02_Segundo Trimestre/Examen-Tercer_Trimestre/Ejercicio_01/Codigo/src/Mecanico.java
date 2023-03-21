import java.time.LocalDate;

public class Mecanico {

    private int idMecanico;
    private String nombre;
    private int zonaActuacion;
    private LocalDate fechaEntradaEmpresa;

    public Mecanico(int idMecanico, String nombre, int zonaActuacion, LocalDate fechaEntradaEmpresa) {
        this.idMecanico = idMecanico;
        this.nombre = nombre;
        this.zonaActuacion = zonaActuacion;
        this.fechaEntradaEmpresa = fechaEntradaEmpresa;
    }

    public int getIdMecanico() {
        return idMecanico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getZonaActuacion() {
        return zonaActuacion;
    }

    public LocalDate getFechaEntradaEmpresa() {
        return fechaEntradaEmpresa;
    }
}
