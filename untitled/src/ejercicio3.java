import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        // 3.	Hacer un programa que pida tres números A, B, C, y después haga el cálculo siguiente: D=((A+B) / C).
        Scanner read = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("introduce 3 numeros.");
        a= read.nextInt();
        b= read.nextInt();
        c= read.nextInt();

        int d=((a+b)/c);

        System.out.println("el total es: " + d );



    }

}
