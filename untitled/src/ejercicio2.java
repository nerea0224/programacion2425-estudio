import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        //2.	Hacer un programa que pida el precio y la cantidad
        // de un producto y calcule el total. Utilizar variables enteras.

        Scanner read = new Scanner(System.in);

        int precio;
        int cantidad;

        System.out.println("introduzca el precio del producto");
        precio= read.nextInt();

        System.out.println("introduzca la cantidad");
        cantidad= read.nextInt();

        int preciototal=precio*cantidad;

        System.out.println("el precio total es: " + preciototal);



    }

}


