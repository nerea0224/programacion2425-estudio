import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //10.Introducir un número por el teclado (de 32 a 255),
        // y muestre el carácter que representa en el código ASCII.

        Scanner read = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numeor del 32 al 255");

        numero=read.nextInt();

        char caracter= (char) numero;

        System.out.println(caracter);
    }
}
