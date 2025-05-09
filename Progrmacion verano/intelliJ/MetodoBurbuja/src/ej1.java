import java.util.Random;

public class ej1 {
    public static void main(String[] args) {
        /*1. Crea un programa que ordene un array de números enteros utilizando
        el algoritmo de la burbuja en orden ascendente (de menor a mayor).
            Instrucciones:
            - Crea un array de al menos 5 elementos (puedes usar números aleatorios).
            - Implementa el algoritmo de la burbuja para ordenar el arreglo.
            - Imprime el arreglo antes y después de la ordenación.*/

        Random random=new Random();
        int[] array={8,15,5,11,18};
        int aux;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        //  algoritmo de la burbuja
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                // Comparamos los elementos
                if (array[j] > array[j + 1]) {
                    // Intercambiamos los elementos si están en el orden incorrecto
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        // Imprimir el array ordenado
        System.out.println("\nArreglo ordenado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
