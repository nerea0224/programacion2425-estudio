import java.io.IOException;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws IOException {

        //12.Programa que lea una palabra de 5 letras y codificarla letra a letra,
        // restando 30 del valor numérico usado para representar la letra (ASCII).
        // Después decodificar una palabra codificada por el método anterior.

        Scanner read = new Scanner(System.in);

        //Pedir una palabra de 5 letras

        System.out.println("Escribe una palabra de 5 letras");
        String palabra=read.nextLine();

        System.out.println(palabra);


        //imprimir la letra a letra y ascii

        System.out.println(palabra.charAt(0) + "-->" + (int)palabra.charAt(0));
        System.out.println(palabra.charAt(1) + "-->" + (int)palabra.charAt(1));
        System.out.println(palabra.charAt(2) + "-->" + (int)palabra.charAt(2));
        System.out.println(palabra.charAt(3) + "-->" + (int)palabra.charAt(3));
        System.out.println(palabra.charAt(4) + "-->" + (int)palabra.charAt(4));

        // Crear Array de 5 posiciones
        int[] palabraCodificadaAscii= new int[5];

        // Letra en Ascii -30
        palabraCodificadaAscii[0]=palabra.charAt(0)-30;
        palabraCodificadaAscii[1]=palabra.charAt(1)-30;
        palabraCodificadaAscii[2]=palabra.charAt(2)-30;
        palabraCodificadaAscii[3]=palabra.charAt(3)-30;
        palabraCodificadaAscii[4]=palabra.charAt(4)-30;

        // Imprimir Ascii -30

        System.out.print(palabraCodificadaAscii[0] + " ");
        System.out.print(palabraCodificadaAscii[1]+ " ");
        System.out.print(palabraCodificadaAscii[2]+ " ");
        System.out.print(palabraCodificadaAscii[3]+ " ");
        System.out.print(palabraCodificadaAscii[4]+ " ");

        //PALABRA CODIFICADA

        System.out.print("\n" +(char)palabraCodificadaAscii[0]);
        System.out.print((char)palabraCodificadaAscii[1]);
        System.out.print((char)palabraCodificadaAscii[2]);
        System.out.print((char)palabraCodificadaAscii[3]);
        System.out.print((char)palabraCodificadaAscii[4]);

        //Descoficicar palabra

        palabraCodificadaAscii[0]=palabraCodificadaAscii[0]+30;
        palabraCodificadaAscii[1]=palabraCodificadaAscii[1]+30;
        palabraCodificadaAscii[2]=palabraCodificadaAscii[2]+30;
        palabraCodificadaAscii[3]=palabraCodificadaAscii[3]+30;
        palabraCodificadaAscii[4]=palabraCodificadaAscii[4]+30;

        //Imprimir palabra descodificada

        System.out.print("\n" + (char)palabraCodificadaAscii[0]);
        System.out.print((char)palabraCodificadaAscii[1]);
        System.out.print((char)palabraCodificadaAscii[2]);
        System.out.print((char)palabraCodificadaAscii[3]);
        System.out.print((char)palabraCodificadaAscii[4]);












        /*System.out.println("inserta un caracter");
        char caracter=(char) System.in.read();

        System.out.println("el numero ASCI de este caracter es: " + caracter + (int)caracter );*/

       /* System.out.println("Introduce un numero");
        int numero=read.nextInt();
        System.out.println("el caracter en ASCI es: " + (char)numero );*/

        /*char[] caracter={'a','x', ' ', 'ñ'};
        caracter[1]='w';
        System.out.println(caracter[1]);*/





    }
}
