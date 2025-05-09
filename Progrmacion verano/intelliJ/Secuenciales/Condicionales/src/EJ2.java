import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        // Ejercicio2:Escribe un programa que verifique si un número ingresado por el usuario está entre 1 y 100

        Scanner read = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int numero=read.nextInt();

        if ((numero>=1) && (numero<=100)){
            System.out.println("Está dentro del parámetro");
        }else {
            System.out.println("No está dentro de parámetro");
        }
    }
}
