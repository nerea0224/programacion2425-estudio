import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //2.Hacer un programa que pida el precio y la cantidad de un producto y calcule el total.
        // Utilizar variables enteras.

        Scanner read = new Scanner(System.in);

        int precio;
        int cantidad;

        System.out.println("Inserte el precio");
        precio=read.nextInt();

        System.out.println("Inserte la cantidad");
        cantidad=read.nextInt();

        //1. con una variable nueva

        int total=precio*cantidad;

        System.out.println("El total es: " + total);

        //2. Imprimirlo directamente

        System.out.println("El total es: " + (precio*cantidad));


    }
}
