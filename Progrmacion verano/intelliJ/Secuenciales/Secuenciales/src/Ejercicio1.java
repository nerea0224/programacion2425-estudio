import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //1.Hacer un programa que pida dos números enteros por el teclado y los sume.

        Scanner read = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Inserte dos numeros");

        num1=read.nextInt();
        num2= read.nextInt();

        // 1. Declarar una variable nueva

        int suma=num1+num2;

        System.out.println("La suma es: " + suma);

        // 2. imprimirlo directamente

        System.out.println("La suma es: " + (num1+num2));



    }
}
