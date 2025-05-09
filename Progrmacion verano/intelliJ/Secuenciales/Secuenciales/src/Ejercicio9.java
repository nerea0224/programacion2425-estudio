import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //9.Introducir  un carácter por el teclado, y mostrar su código ASCII (32 al 255).

        Scanner read = new Scanner(System.in);

        int caracter;

        System.out.println("Introduce un numero del 35 al 255");
        caracter= read.nextInt();

        char CaracterChar= (char) caracter;

        System.out.println(CaracterChar);



    }
}
