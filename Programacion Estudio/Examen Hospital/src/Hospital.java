import java.util.Arrays;
import java.util.Random;

public class Hospital {
    /*Crear una clase hospital que contenga a los empleados. Se crearan en el constructor al menos 3 enfermeros
     y 2 medicos con valores diferentes en sus atributos. Solo hace falta que sea aleatorio el salario base,
     para enfermetos entre 1200 y 1600, para medicos entre 2000 y 3000 */

    private Empleado[] empleados;


    public Hospital (Empleado[] empleados){
        //creo el array con el numero de empleados
       empleados = new Empleado[6];
        Random random = new Random();

       //Agrego a los 3 enfermeros
        empleados[0] = new Enfermero("Axel","15042023A", random.nextFloat(1200,1600),"Abril", new Direccion("travesia 1", "Madrid"),new int[]{8} );
        empleados[1] = new Enfermero("Alma","05072021J", random.nextFloat(1200,1600),"Julio", new Direccion("travesia 2", "Murcia"),new int[]{3} );
        empleados[2] = new Enfermero("Martina","05112024N", random.nextFloat(1200,1600),"Noviembre", new Direccion("travesia 3", "Murcia"),new int[]{10} );
        //Agregar a los 2 medicos
        empleados[3] = new Medico("Nerea","24021997F", random.nextFloat(2000,3000),"Febrero",new Direccion("travesia 4", "Madrid"),"Cardiologa",6 );
        empleados[4] = new Medico("Jorge","27121986N", random.nextFloat(2000,3000),"Noviembre",new Direccion("travesia 5", "Madrid"),"Pediatria",4 );


    }                                            

    public Hospital() {

    }

    //GETTER

    public Empleado[] getEmpleados() {
        return empleados;
    }

    //SETTER

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    //METODOS

    //1
    public String ListadoEmpleados(){
        /*Imprimir los empleados que tiene hospital con todos los atributos*/
        return null;
    }
    //"
    public String AddEmpleado(){
        /*Permitis añadir enfermeros y medicos. Los datos se cargan mediante E/S dentro del metodo
        * El metodo devolvera al empleado construido que sera introducido en hospital siempre wue haya hueco
        * mediante otro metodo que recibira al empleado como argumento de entrada*/
        return null;
    }
    public boolean AddEmpleadoAlHospital(){
        return true;
    }

    //3
    public void ConsultarEmpleados(String localidad){
        /*listar a partir de la localidad(introducida como argumento de entrada) los empleados que residan en ella
        * (en cada localidad) del hospital*/
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i]!=null && empleados[i].getDireccion().getLocalidad().equals(localidad))
                System.out.println(empleados[i]);
        }
    }
   public String[] obtenerEmpleados(String localidad){
        /*listar a partir de la localidad(introducida como argumento de entrada) los empleados que residan en ella
         * (en cada localidad) del hospital*/
        String [] lista = new String[empleados.length];
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i]!=null && empleados[i].getDireccion().getLocalidad().equals(localidad))
                lista[i]= empleados[i].toString();
        }
        return lista;
    }
    //4
    public void ActualizarFechaAltaEmpleado(){
        /*Actualizar fecha de alta del empleado apartir del NIF introducido dentro del metodo
        * no como argumento de entrada*/

    }
    //5
    public boolean ActualizarGuardias (String nif){
        /*Actualizar las guardias que haya hecho un medico en el ultimo mes a partir del NIF del medico
        * introducido como arfumento de entrada. El metodo devolvera un booleano de si se ha podido hacer o no*/
        return true;
    }
    //6
    public boolean EliminarEmpleado(String nif){
        /*eliminar empleado con tenerminado NIF introducido como argumento de entrada*/

        return true;
    }
    //7
    public void SalarioRealMedicos(){
        /*calcular y mostrara el listado del salario de los medicos de una determinada especialidad
        asi como el salario total percibido por todos los integrantes de dicha especialidad*/
    }
    //8
    public void MostrarEmppleados(){
        /*Mostrar lo empleados del Hospital ordenados por nombre en orden alfabetico*/
    }


    //TOSTRING


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======Hospital======").append("\n");
        sb.append("Empleados: ").append(Arrays.toString(empleados)).append("\n");
        sb.append("====================");
        return sb.toString();
    }
}