import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private String email;
    private String telefono;
    private LocalDate fechaObtencionCarnet;

    public Usuario(String nombre, String email, String telefono, LocalDate fechaObtencionCarnet) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fechaObtencionCarnet = fechaObtencionCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaObtencionCarnet() {
        return fechaObtencionCarnet;
    }

    public void setFechaObtencionCarnet(LocalDate fechaObtencionCarnet) {
        this.fechaObtencionCarnet = fechaObtencionCarnet;
    }
}
