package estudioMetodos.ejercicioMetodos;

import java.util.Scanner;

public class ConRetornoSinParametros {
    public static void main(String[] args) {


        //System.out.println(multiplicar());//aqui imprimimos el metodo mutiplicar
        //jugar con el metodo
          //1. inicimos una vaiable que se igual a multiplicar.
            //lo iniciamos en una variable, porque si lo metemos dentro del 'if', nos va a volver a pedir los parametros de entrada
        int operacion=multiplicar();

        if (operacion<20){
            System.out.println("es menor que 20");
        }else System.out.println("es mayor que 20");




    }
    // como el metodo es CON RETORNO no ponemos VOID. ponemos lo que queremos que nos devuelva, en este caso un 'int'
    //el 'static' lo seguimos poniendo para poder llamarlo desde el main que es 'static'

    public static int multiplicar(){
        Scanner read = new Scanner(System.in);
        System.out.println("inserta el valor de 'a' ");
        int a= read.nextInt();
        System.out.println("Insertaa el valor de 'b' ");
        int b= read.nextInt();
        System.out.println("El valor de 'a' es: " + a + "\n El valor de 'b' es: " + b);
        return a*b;
    }
}
