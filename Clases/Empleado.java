public class Empleado extends Empresa{

    private String nombreEmpleado;
    private String correo;
    private String rolEmpleado;


    public Empleado(String nombreEmpresa, String direccion, int telefono, int NIT, String nombreEmpleado, String correo, String rolEmpleado) {
        super(nombreEmpresa, direccion, telefono, NIT);
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;


    }

}
