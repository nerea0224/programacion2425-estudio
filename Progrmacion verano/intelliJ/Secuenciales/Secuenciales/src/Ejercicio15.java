import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        // 15.Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.

        Scanner read = new Scanner(System.in);

        int salario;

        System.out.println("Inserta tu salario actual");
        salario=read.nextInt();

        int Nuevo_Salario= ((salario * 25)/100);

        System.out.println("A tu salario actual le aumentan: " + Nuevo_Salario);

        System.out.println("\n Tu nuevo salario con el incremento del 25% es: " + (salario+Nuevo_Salario));

    }
}
