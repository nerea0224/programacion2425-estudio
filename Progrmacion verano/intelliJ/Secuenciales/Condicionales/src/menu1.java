import java.io.IOException;
import java.util.Scanner;

public class menu1 {
    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        int opcion;
        boolean exit=true;


        while(exit) {
            System.out.println("Elige una opcion");
            System.out.println("1. jugar");
            System.out.println("2. dificultad");
            System.out.println("3. salir");
            opcion = read.nextInt();
            if (opcion<1 || opcion>3) {
                System.out.println("error, escribe otro numero");

            }else {
                switch (opcion) {

                    case 1:
                        int opcion2;
                        boolean exit2=true;

                        while(exit2){
                            System.out.println("1. jugar con amigos");
                            System.out.println("2. en solitario");
                            System.out.println("3. volver");
                            opcion2=read.nextInt();

                            switch (opcion2){
                                case 1:
                                    System.out.println("COMENZAMOS!");
                                    break;
                                case 2:
                                    System.out.println("Mejor solo que con camperos");
                                    break;
                                default:
                                    System.out.println("saliendo...");
                                    exit2=false;
                                    break;
                            }
                        }
                        break;
                    case 2:
                        char opcion3;
                        boolean exit3=true;
                        while (exit3){
                            System.out.println("A. facil");
                            System.out.println("B. media");
                            System.out.println("C. volver");
                            opcion3=(char) System.in.read();

                            switch (opcion3){
                                case 'A':
                                    System.out.println("cagueta");
                                    break;
                                case 'B':
                                    System.out.println("empezamos!");
                                    break;
                                default:
                                    System.out.println("saliendo..");
                                    exit3=false;
                                    break;

                            }
                            //volviendo a releer me limpia el buffer
                            opcion3=(char) System.in.read();
                        }

                        break;
                    default:

                        System.out.println("saliendo..");
                        exit = false;
                }
            }





        }
    }

}
