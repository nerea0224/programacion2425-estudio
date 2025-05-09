import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        //11.Programa que pase de pulgadas a centímetros. (1 pulgada = 2.54 cm)

        Scanner read = new Scanner(System.in);

        double pulgada;

        System.out.println("Introduce el numero de pulgadas");
        pulgada= read.nextDouble();

        double centimetro=pulgada*2.54;

        System.out.println("Las pulgadas son: " + centimetro + "cm");


    }
}
