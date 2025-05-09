public class ej2 {
    public static void main(String[] args) {
        /*2.Hacer un programa en el que dado el siguiente array de nombre origen:
        1.	Lo recorre metiendo en un segundo array de nombre destino todos aquellos elementos que sean pares
             y mayores de 25
        2.	Muestre en pantalla el contenido de los dos arrays unidimensionales*/

        int[] origen = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        int[] destino = new int[origen.length];
        int posicion=0;//declaro la variable posicion para ir guardando las posiciones



        /* inicializo el array a
        //Lo inicializo porque asi me aseguro que emppieza siempre en 0. (pero no esnecesaerio)
        for (int i = 0; i < destino.length; i++)
            destino[i] = 0;*/


        for (int i = 0; i < origen.length; i++) {//recorro el array origen
            if ((origen[i] > 25) && (origen[i] % 2 == 0)) { //pongo las restricciones para coger los numeros
                destino[posicion] = origen[i];
                //la posicion que hay en array 'destino' que viene marcada por la variable 'posicion' es igual al valor que hay en 'origen' marcado en la posicion 'i'.
                posicion++;
                //aqui recorro las posiciones, si cumplen la condicion sigue, sino, no avanza. voy guardando valores en las posiciones.
            }
        }
        System.out.println("\n Array origen: "); //imprimo fuera esto, porque si lo hago dentro del bucle, me lo imprime en cada vuelta
        for (int i = 0; i < origen.length; i++){ //aqui imprimo el array origen
            System.out.print(origen[i] + " ");
          }


        System.out.println("Array destino: ");//imprimo fuera esto, porque si lo hago dentro del bucle, me lo imprime en cada vuelta
       /* for (int i = 0; i < destino.length ; i++) //aqui recorro el array destino
            if (destino[i] != 0)//aqui digo que si la posicion de destino es diferente a 0, entonces imprimemelo
                System.out.print(destino[i] + " ");*/
        /*esta es otra forma de imprimie en pantalla.
        * decimos que si posicion (variable en la que hemos ido guardando los numeros que cumplian la condicion)
        *  es diferente a 0 (posiciones de mi array destino vacias)
        * entonces imprimeme solo las posiciones que no tengan un 0 */
        if (posicion != 0) {
            for (int i = 0; i <= posicion - 1; i++) {
                /*aqui decimos que si 'i' es menor o igual que posicion (variable donde tenemos guardados nuestros numeros que cumplen la condicion)
            entonces ve rrecoriendomelo hasta la ultima posicion.*/
                //Al tener un <= nos pilla una posicion extra, etonces le ponemos el -1 para quitarla
                /*tambien podemos poner " for (int i = 0; i < posicion; i++) ". Al ser un < restrictivo no hace falta poner el -1 porque se queda en la ultima posicion*/
                System.out.print(destino[i] + " "); //imprimimos nuestro array destino sin los ceros
            }
        }
    }
}
