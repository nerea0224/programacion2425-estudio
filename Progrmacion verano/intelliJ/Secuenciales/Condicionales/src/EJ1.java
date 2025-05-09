import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {

        //Ejercicio 1: Edad para votar
        //Escribe un programa que verifique si una persona es mayor de edad y puede votar

        Scanner read = new Scanner(System.in);


        System.out.println("Escribe tu edad");
        int edad=read.nextInt();

        if (edad>=18){
            System.out.println("Puedes votar");

        }else {
            System.out.println("No puedes votar");
        }
    }
}
