import java.io.IOException;
import java.util.Scanner;

public class examen {
    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        int opcion;
        boolean exit=true;
        boolean exit2=true;
        String opcionesUsadas = "";

        while(exit==true){
            System.out.println("Elije una opcion: ");
            System.out.println("1. Mostrar un numero deficiente del 1 al 100");
            System.out.println("2. Contar el total de vocles introducidas en una frase");
            System.out.println("3. Mostrar la secuencia de opciones ejecutadas");
            System.out.println("4. Resetear secuencia de opciones ");
            System.out.println("5. Salir");



            opcion=read.nextInt();


            if (opcion<1 || opcion>5){
                System.out.println("Error. Introduzca otra vez el numero");
            } else {
                switch (opcion){

                    case 1:
                        opcionesUsadas=opcionesUsadas + "1,";
                        System.out.println("1. Mostrar un numero deficiente del 1 al 100");

                        int num = 100;
                        int suma = 0;

                        // va desde desde 1 hasta 100
                        for (int i = 1; i <= num; i++) {

                            // Calcular la suma de los divisores propios
                            for (int j = 1; j < i; j++) {
                                if (i % j == 0) { // Si j es divisor de i
                                    suma += j;
                                }
                            }

                            // Ver si el número es deficiente
                            if (suma < i) {
                                System.out.println(i + " es deficiente");
                            }else {
                                System.out.println(i + " No es deficiete");
                            }
                            suma=0;
                        }
                        break;

                    case 2:
                        opcionesUsadas=opcionesUsadas + "2,";
                        System.out.println("2. Contar el total de vocles introducidas en una frase");


                        char letra;
                        int A=0;
                        int E=0;
                        int I=0;
                        int O=0;
                        int U=0;
                        int totalVocales = 0;


                        System.out.println("Introduce el texto carácter por carácter (finaliza con '*'):");

                        while (exit2==true) {
                            letra = (char) System.in.read();

                            if (letra == 'A'||  letra == 'a' ||
                                    letra == 'E' || letra == 'e'||
                                    letra == 'I' || letra == 'i'||
                                    letra == 'O' || letra == 'o'||
                                    letra == 'U' || letra == 'u') {
                                totalVocales++;
                            }
                            if (letra == 'A' || letra=='a') {
                                A++;

                            }else if (letra == 'E' || letra=='e') {
                                E++;

                            }else if (letra == 'I' || letra=='i') {
                                I++;

                            }else if (letra == 'O' || letra=='o') {
                                O++;

                            }else if (letra == 'U' || letra=='u') {
                                U++;
                            }

                            if (letra == '*') {
                                exit2=false;
                            }


                        }
                        System.out.println("Ha introducido " + A + " A de " + totalVocales + " vocales introducidas");
                        System.out.println("Ha introducido " + E + " E de " + totalVocales + " vocales introducidas");
                        System.out.println("Ha introducido " + I + " I de " + totalVocales + " vocales introducidas");
                        System.out.println("Ha introducido " + O + " O de " + totalVocales + " vocales introducidas");
                        System.out.println("Ha introducido " + U + " U de " + totalVocales + " vocales introducidas");

                        break;

                    case 3:
                        opcionesUsadas=opcionesUsadas + "3,";
                        System.out.println("3. Mostrar la secuencia de opciones ejecutadas");
                        System.out.print("La secuencia seguida en el menu es: ");
                        System.out.println(opcionesUsadas);


                        break;

                    case 4:
                        opcionesUsadas=opcionesUsadas + "4,";
                        System.out.println("4. Resetear secuencia de opciones ");
                        opcionesUsadas=opcionesUsadas + "";


                        break;

                    default:
                        System.out.println("saliendo...");
                        exit=false;
                }
            }

        }
    }
}
