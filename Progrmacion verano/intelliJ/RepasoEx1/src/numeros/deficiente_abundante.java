package numeros;

import java.util.Random;
import java.util.Scanner;

public class deficiente_abundante {
    public static void main(String[] args) {
        /*Un número es deficiente si la suma de sus divisores propios es menor que el número.
        * Un número es abundante si la suma de sus divisores propios es mayor que el número*/
        Scanner read= new Scanner(System.in);
        System.out.println("inserta numero");
        int num=read.nextInt();
        int suma=0;


        for (int i = 1; i <num ; i++) {

            if (num%i==0){
                suma+=i;

            }

        }
        if (suma<num){
            System.out.println(num + " Es deficiente");
        }else {
            System.out.println(num + " Es abundante");
        }

        
    }
}
