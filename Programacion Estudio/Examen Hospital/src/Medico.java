public class Medico extends Empleado {
    private String especialidad;
    private int guardiasMes;

    public Medico(String nombre, String nif, float sueldoBase, String fechaAltaHospital, Direccion direccion, String especialidad, int guardiasMes){
        super(nombre,nif,sueldoBase,fechaAltaHospital,direccion);
        this.especialidad=especialidad;
        this.guardiasMes=guardiasMes;

    }
    public Medico(){
        super();

    }

    //GETTER

    public String getEspecialidad() {
        return this.especialidad;
    }

    public int getGuardiasMes() {
        return this.guardiasMes;
    }

    //SETTER

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setGuardiasMes(int guardiasMes) {
        this.guardiasMes = guardiasMes;
    }

    //METODOS
    public float salarioReal(){
        /*Salario base mas 5% del salario base por cada guardia*/

       float plusPorGuardia=(0.05f*getSueldoBase())*guardiasMes;

        return getSueldoBase()+plusPorGuardia;

    }

    //TOSTRING

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("======Medico====== ").append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("NIF: ").append(getNif()).append("\n");
        sb.append("Sueldo Base: ").append(getSueldoBase()).append("\n");
        sb.append("Fecha De Alta En El Hospital: ").append(getFechaAltaHospital()).append("\n");
        sb.append("Direccion: ").append(getDireccion()).append("\n");
        sb.append("Especialidad: ").append(especialidad).append("\n");
        sb.append("Guardias al Mes: ").append(guardiasMes).append("\n");
        sb.append("======================");
        return sb.toString();
    }
}
