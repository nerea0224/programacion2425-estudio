import java.util.Random;

public class ej9 {
    public static void main(String[] args) {
        /*9.Hacer un programa que sume los números que hay en las posiciones pares de una lista de diez elementos.*/

        int[] elementos = new int[10];
        int suma=0;
        int posicion=0;
        Random random = new Random();

        //carga del array
        System.out.println("Numeros del array:");
        for (int i = 0; i < elementos.length; i++) {
            elementos[i]= random.nextInt(0,100);
            System.out.print(elementos[i] + " ");

        }
        //recorrer el array con condiciones e imprimir
        System.out.println("\nLos numeros de las posiciones pares son:");
        for (int i = 0; i < elementos.length; i++) {
            posicion=i;
            if (posicion%2==0){
                suma+=elementos[i];

                System.out.print( elementos[i] + " ");

            }


        }System.out.print("\nLa suma de las posiciones pares es: " + suma);




    }
}
