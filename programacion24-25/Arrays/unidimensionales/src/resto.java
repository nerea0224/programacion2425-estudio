import java.util.Scanner;

public class resto {
    public static void main(String[] args) {

      // deficientes
        //suma de los divisores de un numero
        int suma=0;

        for (int i = 1; i <=100 ; i++) {

            for (int j = 1; j <i ; j++) {

                if (i%j==0){
                    suma+=j;
                }

            }
            if (suma<i){
                System.out.println( i + " es deficinete");
            }else {
                System.out.println( i + " no es deficinete");
            }

            suma=0;

        }





    }
}
