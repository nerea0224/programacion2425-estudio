package numeros;

import java.util.Scanner;

public class Odioso_Malvado {
    public static void main(String[] args) {
        /*odiosos en su numero binario tienen los 1 impares
        * mavados en su numero binario tienen los 1 pares*/


        int contadorUnos=0;

        for (int num = 1; num <50 ; num++) {
            for (int i = num; i >0 ; i=i/2) {

                if (i%2==1){
                    contadorUnos++;

                }

            }

            if (contadorUnos%2==0){

                System.out.println(num + " es malvado");
            }else {
                System.out.println(num + " es odioso");
            }
        }





    }
}
