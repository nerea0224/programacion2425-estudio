import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        /* 1.Hacer un programa que:
		1.Cree un array unidimensional de nombre “vector” y 15 elementos, siendo sus componentes de tipo numérico entero
		2.Cargar el array con valores aleatorios y otro que sean introducidos por teclado
		3.Calcular la suma de los primeros N elementos almacenados en el array
		4.Muestre el resultado obtenido así como el contenido del array en pantalla*/

        /*//Array unidimensional

        int vector [] = new int[15];
        Random aleatorio = new Random();//declaro el random para obtener los aleatrotios

        //Array con valores aleatorios

        for (int i = 0; i < vector.length; i++) { //aqui digo que si mi array vectos es menor que 'i', entonces imprimeme aleatorios de 1 al 25
            vector[i]=aleatorio.nextInt(1,25);
        }

        //Hacer otro bucle for para imprimir los datos aleatorios

        for (int i = 0; i < vector.length; i++) {//aqui decimos que si mi array vector es menor que 'i' entonces be recorriendolo
            System.out.print(vector[i]+" "); //aqui me imprime el array vector con los numeros aleatorios comprendidos del 1 al 25
        }*/


        //introducidos por teclado
        Scanner read = new Scanner(System.in);
        int[] vector=new int[15];
        int num=0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("introduce un numero");
            num= read.nextInt(); //vector[i]=read.nextInt();
            vector[i]=num;
        }
        System.out.println("introduce el numero de elementos que quieres sumar");
        int N=read.nextInt();
        int suma=0;
        for (int i = 0; i < N; i++) {
            suma=suma+ vector[i];
        }
        System.out.println(suma);


        }


    }





