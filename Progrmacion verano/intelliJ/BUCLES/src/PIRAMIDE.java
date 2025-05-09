import java.util.Scanner;

public class PIRAMIDE {
    public static void main(String[] args) {
    //DEL 1 AL 10 Y DEL 10 AL 1, DEJANDO SIEMPRE 1 EN LA PRIMERA COLUMNA (J)

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }

        for (int i = 9; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " " );
            }
            System.out.println();
        }
/* // DEL 10 AL 1
        for (int i = 10; i >=1 ; i--) {
            for (int j = i; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }*/
    }

}


