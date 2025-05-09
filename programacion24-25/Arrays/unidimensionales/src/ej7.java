import java.util.Random;

public class ej7 {
    public static void main(String[] args) {
        /*7.Hacer un programa que:
                1.	Cree un array unidimensional de 30 elementos de tipo numérico entero y nombre ”números”
                2.	Inicializar el array con valores +, - y nulos
                3.	Contabilizar el número de valores +,- y nulos
                4.	Mostrar en pantalla los resultados obtenidos*/

        int[] numeros=new int[30];//Me inicializo el array a 30
        int pos=0;
        int neg=0;
        int nulo=0;
        Random random = new Random();//utilizo el random para obtener los 30 numeros

        System.out.println("Los numeros del array son: ");//lo ponemos fuera para que no se imprima en cada vuelta

        for (int i = 0; i < numeros.length ; i++) {//aqui nos referimos a que si posicion 'i' es menos que la longud del array siga hasta llegar al final
            numeros[i]= random.nextInt(-30,30);//aqui hacemos que las posiciones 'i' en el array numeros se rellenen con numeros random. Inicializamos el random
            System.out.print(numeros[i] +  " ");//aqui vamos imprimiendo cada numero
        }
        for (int i = 0; i < numeros.length; i++) {//aqui hacemos un bucle para ir recorriendo el array y ponerle condiciones
            //si posicion 'i' es cero y es menor que la longitud del array 'numeros', entonces ve recorriendomelo
            if (numeros[i]==0){
                nulo++;
            } else if (numeros[i]>0) {
                pos++;

            }else{
                neg++;
            }

        }
        System.out.println("\n Hay: \n " + nulo + " nulos,\n " + pos + " positivos \n " + neg + "  negativos");
        //se imprime fuera para que no diga en cada vuelta si es positivo, negativo o neutro

    }
}
