import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //5.Hacer un programa que pida los valores de los dos catetos de un triángulo rectángulo,
        // y calcule el valor de la hipotenusa. Utilizar la librería Math.

        Scanner read = new Scanner(System.in);

        double cateto1;
        double cateto2;

        System.out.println("Introduce el valor de los 2 catetos");
        cateto1= read.nextDouble();
        cateto2= read.nextDouble();

        //hipotenusa2= (cateto1^2 + cateto2^2)

        double hipotenusa=Math.sqrt((Math.pow(cateto1,2)) + (Math.pow(cateto2,2)));

        System.out.println("La hipotenusa del triangulo es: " + hipotenusa);


    }
}
