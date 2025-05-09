import java.util.Scanner;

public class clase2 {
    public static void main(String[] args) {
        //Escribe un programa que pida 10 números por teclado, los almacene en un array y que luego muestre el máximo valor,
        // el mínimo y las posiciones que ocupan en el array.

        Scanner read = new Scanner(System.in);
        int[] numeros=new int[10];

        numeros[0]=3;

        for (int i = 1; i < numeros.length ; i++) {

            System.out.println("Escribe un numero");

            numeros[i]=read.nextInt();

        }
        for (int i = 0; i < numeros.length; i++) {

            System.out.print(numeros[i] + ",");

        }
    }
}
