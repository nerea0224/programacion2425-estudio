import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //3.Hacer un programa que pida tres números A, B, C, y después haga el cálculo siguiente:
        // D=((A+B) / C).

        Scanner read = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Introduce 3 numeros");

        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();

        //1. Declarando variable

        int d=((a+b)/c);
        System.out.println("El calculo es: " + d);

        //2. Imprimirlo directamente

        System.out.println("El calculo es: " + (d=((a+b)/c)) );


    }
}
