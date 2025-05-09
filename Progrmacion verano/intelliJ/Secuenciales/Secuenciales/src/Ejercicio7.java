import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //7.Hacer un programa que pida el radio R de una circunferencia, y  calcule la longitud y el área.

        Scanner read = new Scanner(System.in);


        System.out.println("introduce el Radio");

        double radio= read.nextDouble();

        System.out.println("El radio de la circinferencia es: " + radio);

        //Calcular longitud = 2*PI*R
        double longitud=(2*(Math.PI * radio));

        System.out.println("La longitud es: " + longitud);


        //Calcular area= PI*R^2

        double area=(Math.PI*(Math.pow(radio,2)));

        System.out.println("El area de la circunferencia es: " + area);



    }
}
