import java.util.Random;

abstract class Empleado {

    private String nombre;
    private String nif;
    private float sueldoBase;
    private String fechaAltaHospital;
    private Direccion direccion;

    public Empleado(String nombre, String nif, float sueldoBase, String fechaAltaHospital, Direccion direccion){
        this.nombre=nombre;
        this.nif=nif;
        this.sueldoBase=sueldoBase;
        this.fechaAltaHospital=fechaAltaHospital;
        this.direccion=direccion;
    }
    public Empleado(){


    }

    //GETTER

    public String getNombre() {
        return nombre;
    }

    public String getNif() {
        return nif;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public String getFechaAltaHospital() {
        return fechaAltaHospital;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    //SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setFechaAltaHospital(String fechaAltaHospital) {
        this.fechaAltaHospital = fechaAltaHospital;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //METODOS
    public abstract float salarioReal();



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======Empleados====== ").append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("NIF: ").append(nif).append("\n");
        sb.append("Sueldo Base: ").append(sueldoBase).append("\n");
        sb.append("Fecha De Alta En El Hospital: ").append(fechaAltaHospital).append("\n");
        sb.append("Dirccion: ").append(direccion).append("\n");
        sb.append("======================");
        return sb.toString();
    }
}
