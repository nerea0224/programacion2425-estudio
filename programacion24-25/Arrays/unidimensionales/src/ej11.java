import java.util.Random;

public class ej11 {
    public static void main(String[] args) {
        /*11.Hacer un programa que gire los elementos de  una lista
        de modo que el primero se intercambia con el último, el segundo con el penúltimo,...*/

        int [] lista= new int[6];

        Random random=new Random();
        //carga de array
        System.out.println("Lista de elementos: ");
        for (int i = 0; i < lista.length ; i++) {
            lista[i]= random.nextInt(0,100);
            System.out.print(lista[i]+" ");
        }

        //cambio de variables
        for (int i = 0; i < lista.length/2; i++) {//pongo 'lista.length/2' al cambiar las posiciones, solo haria falta cambiar hasta la mitad de la lista
              int j= lista.length-i-1;
              //aqui le digo que 'j' tiene un valor de la longitud de lista, menos posicion (i), menos 1.
            //o sea, 5-0-1=4. con esto estoy diciendo que la posicion de 'j' es 4 ('j' tiene el valor de la posicion 4 del array lista)
                int a= lista[i];
                int b=lista[j];
                lista[i]=b;
                lista[j]=a;
                /*las variables 'a' y 'b' se hacen para poder intercambiar las posiciones de 'i' y 'j' y asi poder hacer que se cambien de posicion*/

        }
        System.out.print("\n lista al reves: \n");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }


    }
}
