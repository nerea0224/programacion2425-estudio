import java.util.Random;

public class ej10 {
    public static void main(String[] args) {
        /*10.Hacer un programa que intercambie el primer y el último elemento de una lista.*/

        int[] lista=new int[6];
        int primero=0;
        int ultimo=0;

        Random random=new Random();

        //carga de array
        System.out.println("Lista: ");
        for (int i = 0; i < lista.length; i++) {
             lista[i]= random.nextInt(0,20);
            System.out.print(lista[i] + " ");

        }
        //intercambiar el primero y el ultimo numero
        System.out.println();//esto lo ponemos aqui para quehaga un salto de linea
        /* 1. El intercambio de variables lo hacemos fuera, porque si lo hacemos dentro del bucle, se intercambian continuamente
        * 2. el intercambio se puede hacer fuera porque dentro de '[]' intercambiamos las posicones y no 'i'.
        *     Si dentro de '[]' pusieramos la 'i' nos daría error.
        * 3. no nos da error al colocar una posicion especifica dentro de '[]' porque el array lo hemos inicializado fuera de bucles*/
        primero=lista[0]; //aqui nos referimos a que 'primero= a la posicion '0' de nuestro array 'lista'
        ultimo=lista[lista.length-1];/*aqui nos referimos a que 'ultimo= a la posicion 'total del array (6)-1=5' de nuestro array 'lista'
                                       con el '-1' hacemos que nuestro array valga 6 porque empieza desde la posicion '0', entonces necesitamos la posicion 5
                                       si no ponemos el '-1' nos iriamos a la posicion 6 que se nos sale de los parametros*/

        lista[lista.length-1]=primero;/*aqui invertimos para que lo que habiamos dicho que era el 'primero' numero de nuetro array, posicion'0'.
                                       se intercambie y y ahora valga la posicion '5' de nuestro array */

        lista[0]=ultimo;/*aqui invertimos para que lo que habiamos dicho que era el 'ultimo' numero de nuetro array, posicion'5'.
                         se intercambie y y ahora valga la posicion '0' de nuestro array */

        //imprimir array
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }




    }
}
