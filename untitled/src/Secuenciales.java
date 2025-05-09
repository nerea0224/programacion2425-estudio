import java.util.Scanner;

public class Secuenciales {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introduzca el primer numero");
        num1= read.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2= read.nextInt();

        int sumatotal=num1+num2;

        System.out.println("La suma de los dos numeros es: " + sumatotal);

        System.out.println("La suma de los dos numeros es: " + (num1+num2));


    }
}

