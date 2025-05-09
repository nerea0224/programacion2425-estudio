import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

       int [] numeros={-7,100,3,-2,0};

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i]<0){
                System.out.println( "el numero: " + numeros[i] +" es negativo" + " su posicion en el array es: " + i );
            } else if (numeros[i]==0) {
                System.out.println("el numero: " + numeros[i] +" es neutro" + " su posicion en el array es: " + i );

            } else {
                System.out.println( "el numero: " + numeros[i] +" es positivo" + " su posicion en el array es: " + i );
            }


        }

    }
}

