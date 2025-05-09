import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Enfermero nefermero= new Enfermero("pepe", "asdf",3434,"dfa", new Direccion("asdf","asdf"),44);


        /*crear un menu con las siguientes acciones:
         * 1. listar empleados
         * 2.Añadir empleado
         * 3.consultar empleado
         * 4.actualizar fecha de alta del empleado
         * 5.Actualizar guardias
         * 6.Eliminar empleado
         * 7.mostar salario medico
         * 8.Mostrar empleados ordenados alfabeticamente
         * */
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        boolean exit = true;
        Hospital hospital = new Hospital();
        while (exit) {
            System.out.println("Elije una opcion: ");
            System.out.println("1. Listar empleados ");
            System.out.println("2. Añadir empleado ");
            System.out.println("3. Consultar empleado ");
            System.out.println("4. Actualizar fecha de alta del empleado ");
            System.out.println("5. Actualizar guardias ");
            System.out.println("6. Eliminar empleado ");
            System.out.println("7. Mostar salario medico");
            System.out.println("8 .Mostrar empleados ordenados alfabeticamente");
            System.out.println("9. Salir");

            opcion = read.nextInt();
            read.nextLine();//limpia el enter
            if (opcion < 1 || opcion > 9) {
                System.out.println("ERROR!" + "\n Inserta un numero entre el 1 y el 9");
            } else
                switch (opcion) {
                    case 1:
                        System.out.println("===Listar empleados=== ");
                        break;
                    case 2:
                        System.out.println("===Añadir empleado=== ");
                        break;
                    case 3:
                        System.out.println("===Consultar empleado=== ");
                        System.out.println("Inserta localidad");
                        String localidad = read.nextLine();
                        hospital.ConsultarEmpleados(localidad);
                        System.out.println(Arrays.toString(hospital.obtenerEmpleados(localidad)));
                        break;
                    case 4:
                        System.out.println(" ===Actualizar fecha de alta del empleado=== ");
                        break;
                    case 5:
                        System.out.println(" ===Actualizar guardias=== ");
                        break;
                    case 6:
                        System.out.println("===Eliminar empleado=== ");
                        break;
                    case 7:
                        System.out.println("===Mostar salario medico===");
                        break;
                    case 8:
                        System.out.println("===Mostrar empleados ordenados alfabeticamente===");
                        break;
                    case 9:
                        System.out.println("Saliendo...");
                        exit = false;

                }
        }

    }
}