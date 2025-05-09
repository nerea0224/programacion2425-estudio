import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        //Ejercicio3: Categoría por Edad (else-if)
        //Escribe un programa que lea la edad de una persona e imprima la categoría correspondiente:
        //Niño: 0-12 años
        //Adolescente: 13-17 años
        //Adulto Joven: 18-35 años
        //Adulto: 36-55 años
        //Adulto Mayor: 56 años o más

        Scanner read = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int edad=read.nextInt();

        if ((edad>=0) && (edad<=12)){
            System.out.println("Eres un niño");
        } else if ((edad>=13)&&(edad<=17)) {
            System.out.println("Eres adolescente");

        } else if ((edad>=18)&&(edad<=35)) {
            System.out.println("Eres Adulto Joven");

        } else if ((edad>=36)&&(edad<=55)) {
            System.out.println("Eres Adulto");

        } else if ((edad>=56)) {
            System.out.println("Eres adulto mayor");

        }
    }
}
