import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        //4.	Hacer un programa que calcule el cuadrado de un número.
        Scanner read = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero");
        num= read.nextInt();

        int cuadrado=num*num;

        System.out.println("El total es: " + cuadrado );



    }
}
