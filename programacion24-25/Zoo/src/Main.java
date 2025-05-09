
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Animales animales= new Animales();


            Scanner read = new Scanner(System.in);
            int opcion;
            boolean exit=true;



            while(exit==true){
                System.out.println("Elije una opcion: ");
                System.out.println("1.listar animales");
                System.out.println("2. insertar animal");
                System.out.println("3. borrar animal");
                System.out.println("4. modificar animal ");
                System.out.println("5. Salir");



                opcion=read.nextInt();


                if (opcion<1 || opcion>5){
                    System.out.println("Error. Introduzca otra vez el numero");
                } else {
                    switch (opcion){

                        case 1:

                            System.out.println(animales);

                            break;

                        case 2:





                            break;

                        case 3:



                            break;

                        case 4:
                            //seters


                            break;

                        default:
                            System.out.println("saliendo...");
                            exit=false;
                    }
                }

            }
        }
    }

