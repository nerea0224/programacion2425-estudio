import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        //Ejercicio: Contar Números Positivos y Negativos en un Array
        //Escribe un programa que lea una lista de números (almacenados en un array)
        // e imprima cuántos son positivos, cuántos son negativos y cuales neutros.
        // IMPORTANTE: En este array los valores los inserta el usuario,
        // es decir primero asignas un tamaño al array (10 por ejemplo)
        // con el int[] array = new int[10] y
        // el usuario uno por uno va rellenando las posiciones del array por teclado.
        // Una vez el array esta completo lo recorres
        // y muestras por pantalla cuales son negativos, positivos y neutros


        Scanner read = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("inserta 1 numero");
            numeros[i]= read.nextInt();

        }



    }


}

