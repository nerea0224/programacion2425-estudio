import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //4.Hacer un programa que calcule el cuadrado de un número.

        Scanner read = new Scanner(System.in);

        int numero;


        System.out.println("Introduce un numero: ");
        numero=read.nextInt();

        int cuadrado=numero*numero;

        System.out.println("El cuadrado de: " + numero + " \nes: " + cuadrado);


    }
}
