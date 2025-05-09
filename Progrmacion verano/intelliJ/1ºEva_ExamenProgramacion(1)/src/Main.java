import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner read=new Scanner(System.in);
        char opcion;
        boolean exit=true;
        String ruta = "";
        int plantaActual=0;
        int subir;
        int bajar;

        while(exit==true){
            System.out.println("Elige una opcion");
            System.out.println("A Subir a la planta X");
            System.out.println("B Bajar a la plata Y");
            System.out.println("C Mostrar planta actual");
            System.out.println("D Mostrar ruta recorrida");
            System.out.println("E Resetear la planta actual");
            System.out.println("F salir");

            opcion=read.next().toUpperCase().charAt(0);

            if (opcion!='A' && opcion!='B'&& opcion!='C'&& opcion!='D'&& opcion!='E'&& opcion!='F'){
                System.out.println("Error. Inserte letra");
            }else {
                switch(opcion){


                    case 'A':
                        ruta=ruta + "A,";
                        System.out.println("Indique a que planta desea subir");
                        subir=read.nextInt();
                        if (subir>plantaActual){

                            for (int i = plantaActual; i <subir ; i++) {
                                System.out.println("planta: " + i);

                            }

                        }else {
                            System.out.println("error. Vuelva indicar a que planta desea subir");

                        }
                        plantaActual=subir;
                        System.out.println("Su planta de destino: " + plantaActual);
                        break;
                    case 'B':
                        ruta=ruta + "B,";
                        System.out.println("Inserte la planta a la que desea bajar");
                        bajar=read.nextInt();
                        if (bajar<plantaActual){

                            for (int i = plantaActual; i>bajar ; i--) {
                                System.out.println("planta: " + i);

                            }

                        }else {
                            System.out.println("error. Vuelva indicar a que planta desea subir");

                        }
                        plantaActual=bajar;
                        System.out.println("Su planta de destino: " + plantaActual);

                        break;
                    case 'C':

                        System.out.println("Su planta actual es: "+plantaActual);
                        break;
                    case 'D':
                        System.out.println("La ruta recorrida es: " + ruta);
                        break;
                    case 'E':
                        plantaActual=0;
                        ruta="";
                        break;
                    default:
                        System.out.println("saliendo...");
                        exit=false;







                }
            }

        }





    }
}