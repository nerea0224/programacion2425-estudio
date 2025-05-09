package numeros;

import java.util.Scanner;

public class malvados {
    public static void main(String[] args) {
        /*Un número malvado es aquel cuya representación binaria contiene un número par de unos.*/

        Scanner read = new Scanner(System.in);
       System.out.println("introduce un numero");
        int num=read.nextInt();
        int cuentaUnos=0; //queremos contar cuantos numeros hay para saber si es malvado o no


            for (int i = num; i>0 ; i=i/2) {
                if (i%2==1){
                    cuentaUnos++;
                }


            }
            if (cuentaUnos % 2 == 0) {
                System.out.println( num +" El número es malvado.");
            } else {
                System.out.println(num + " El número no es malvado.");
            }
        }



        }






