import java.util.Random;

public class Enfermero extends Empleado {
    private int numeroPacientesDiarios[];

    public Enfermero(String nombre, String nif, float sueldoBase, String fechaAltaHospital, Direccion direccion,int[] numeroPacientesDiarios){
        super(nombre,nif,sueldoBase,fechaAltaHospital,direccion);
        this.numeroPacientesDiarios=numeroPacientesDiarios;

    }
    public Enfermero(){
        super();
        Random random = new Random();
        numeroPacientesDiarios= new int[30];
        for (int i = 0; i < numeroPacientesDiarios.length ; i++) {
            numeroPacientesDiarios[i]= random.nextInt(0,30);

        }
        //rellenar el array con random


    }

    //GETTER

    public int[] getNumeroPacientesDiarios() {
        return numeroPacientesDiarios;
    }

    //SETTER

    public void setNumeroPacientesDiarios(int[] numeroPacientesDiarios) {
        this.numeroPacientesDiarios = numeroPacientesDiarios;
    }

    //METODOS
    public float salarioReal(){
        /*Salario real del enfermero es el salario base mas el 1% del salario base por cada persona que tenga a su cargo*/
         //dentro del metodo puedo crear nuevas variables, como su fuera un ejercicio aparte
        float plusPorPaciente=(0.01f*getSueldoBase()*numeroPacientesDiarios.length);
        return getSueldoBase()+plusPorPaciente;
    }


    //TOSTRING

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======Enfermero====== ").append("\n");
        sb.append("Nombre: ").append(getNombre()).append("\n");
        sb.append("NIF: ").append(getNif()).append("\n");
        sb.append("Sueldo Base: ").append(getSueldoBase()).append("\n");
        sb.append("Fecha De Alta En El Hospital: ").append(getFechaAltaHospital()).append("\n");
        sb.append("Direccion: ").append(getDireccion()).append("\n");
        sb.append("Numero De PPacientes Diarios: ").append(numeroPacientesDiarios).append("\n");
        sb.append("======================");
        return sb.toString();
    }
}
