import java.sql.Array;
import java.util.ArrayList;

public class EmpresaMecanico {
    private final String nombreEmpresa= "Empresa de Mecanica";
    private ArrayList <Mecanico> listadoEmpleados = new ArrayList();

    public EmpresaMecanico(ArrayList<Mecanico> listadoEmpleados) {
        this.listadoEmpleados = listadoEmpleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Mecanico> getListadoEmpleados() {
        return listadoEmpleados;
    }

    public void setListadoEmpleados(ArrayList<Mecanico> listadoEmpleados) {
        this.listadoEmpleados = listadoEmpleados;
    }

    public int[] datosParaReparacion(Mecanico mecanicoReparacion){
        /*
        Los mecánicos no forman parte de la empresa, 
        por lo que no tendremos todos sus datos, 
        únicamente se dispone de un código y la zona preferente de actuación.
         */
        int [] unicosDatosDisponibles = new int[2] ;
        unicosDatosDisponibles[0]=mecanicoReparacion.getIdMecanico();
        unicosDatosDisponibles[1]=mecanicoReparacion.getZonaActuacion();
        return unicosDatosDisponibles;
    }
}
