import java.util.Random;

public class ej14 {
    public static void main(String[] args) {
        /*14.Hacer un programa que diga cuantas veces aparece cada uno de los elementos de un array.
        El programa ha de controlar que un número no se analice dos veces; por ejemplo, si hay un 3 en la segunda posición y otro en la sexta,
        el programa ha de decir que el 3 aparece dos veces, pero sólo cuando encuentra el que hay en la tercera posición,
        cuando encuentre el que hay a la sexta, no lo tiene que evaluar.
        - Sugerencia, utilizar un array auxiliar para ir guardando los elementos analizados.*/

        int[] array = new int[10];
        Random random= new Random();

            //carga del array
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt();
        }



    }
}
