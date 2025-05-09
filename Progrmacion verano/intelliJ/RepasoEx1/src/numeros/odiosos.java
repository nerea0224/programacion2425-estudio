package numeros;

import java.util.Scanner;

public class odiosos {
    public static void main(String[] args) {
       /* Un número odioso es aquel cuya representación binaria contiene un número impar de unos.*/

        Scanner read = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num=read.nextInt();
        int cuentaUnos=0;

        for (int i = num; i >0 ; i=i/2) {
            if (i%2==1){
                cuentaUnos++;

            }

        }
        if (cuentaUnos==3){
            System.out.println("es un numero odioso");
        }else {
            System.out.println("no es un numero odioso");
        }
    }
}
