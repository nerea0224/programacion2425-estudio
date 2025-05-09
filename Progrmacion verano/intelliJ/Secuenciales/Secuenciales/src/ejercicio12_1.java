import java.util.Scanner;

public class ejercicio12_1 {
    public static void main(String[] args) {

        //12.Programa que lea una palabra de 5 letras y codificarla letra a letra,
        // restando 30 del valor numérico usado para representar la letra (ASCII).
        // Después decodificar una palabra codificada por el método anterior.

        Scanner read = new Scanner(System.in);

        //Plabra de 5 letras
        System.out.println("Escribe una palabra de 5 letras");

        String palabra=read.nextLine();

        //codificar palabra letra  a letra

        System.out.println(palabra.charAt(0));






    }
}
