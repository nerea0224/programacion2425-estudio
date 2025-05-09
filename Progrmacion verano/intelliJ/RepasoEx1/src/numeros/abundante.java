package numeros;

import java.util.Scanner;

public class abundante {
    public static void main(String[] args) {
        /*Un número es abundante si la suma de sus divisores propios es mayor que el número.*/

        Scanner read = new Scanner(System.in);
        System.out.println("inserta numero");
        int num=read.nextInt();
        int suma=0;

        for (int i = 1; i <num ; i++) {
            if (num%i==0){
                suma+=i;

            }

        }
        if (suma>num){
            System.out.println(num + " Es abundante");
        }else {
            System.out.println(num + " No es abundante");
        }
    }
}
