import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        /*13.Diseña un programa para realizar la conversión de números en base decimal entre 0 y 32000 a base hexadecimal.
        Para ello el algoritmo tendrá como:
        - Datos de entrada: Un número entero positivo entre 0 y 32000 cualquiera dado por el usuario.
            El programa deberá verificar que el numero entrado cumple esas condiciones.
        - Datos de salida: Impresión en pantalla de un array de caracteres que contenga el equivalente en base hexadecimal del numero entrado.
            Este array deberá estar formado por un máximo de cuatro elementos (dígitos)
            que pueden ser cifras entre 0 y 9 y letras entre A y F.*/

        Scanner read = new Scanner(System.in);
        int num=0;
        System.out.println("Inserta un numero entre 0 y 32mil");
        num=read.nextInt();
        if ((num<0) || (num>32000)){
            System.out.println("No esta entre los parametros indicados, por favor inserte otra vez el numero");
        }

    }
}
