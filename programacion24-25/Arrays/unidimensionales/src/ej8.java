import java.util.Random;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        /*8.Hacer un programa que:
            1.	Lea una secuencia de 20 valores numéricos reales y los almacene en un array de nombre “números”
            2.	Muestra en pantalla cuál es el valor máximo, así como la posición que ocupa en el array.
            En el caso de aparecer repetido mostrará sólo el de menor índice*/

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[] numeros= new int[20];
        int mayor=0;
        int pos=0;

        System.out.println("Los 20 numeros son: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= random.nextInt(1,50);
            System.out.print(numeros[i] + " ");

        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor) {
                mayor=numeros[i];
                pos=i;
            }

        }
        System.out.print("\n"+mayor + " " +pos);



    }
}
