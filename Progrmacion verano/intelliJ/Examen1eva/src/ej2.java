import java.io.IOException;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) throws IOException {

        Scanner read = new Scanner(System.in);
        char letra;
        int A=0;
        int E=0;
        int I=0;
        int O=0;
        int U=0;
        int totalVocales = 0;
        boolean exit=false;

        System.out.println("Introduce el texto carácter por carácter (finaliza con '*'):");

        while (exit==false) {
            letra = (char) System.in.read();

            if (letra == 'A'||  letra == 'a' ||
            letra == 'E' || letra == 'e'||
            letra == 'I' || letra == 'i'||
            letra == 'O' || letra == 'o'||
            letra == 'U' || letra == 'u') {
                totalVocales++;
            }
            if (letra == 'A' || letra=='a') {
                A++;

            }else if (letra == 'E' || letra=='e') {
                E++;

            }else if (letra == 'I' || letra=='i') {
                I++;

            }else if (letra == 'O' || letra=='o') {
                O++;

            }else if (letra == 'U' || letra=='u') {
                U++;
            }

            if (letra == '*') {
                exit=true;
            }


        }
        System.out.println("Ha introducido " + A + " A de " + totalVocales + " vocales introducidas");
        System.out.println("Ha introducido " + E + " E de " + totalVocales + " vocales introducidas");
        System.out.println("Ha introducido " + I + " I de " + totalVocales + " vocales introducidas");
        System.out.println("Ha introducido " + O + " O de " + totalVocales + " vocales introducidas");
        System.out.println("Ha introducido " + U + " U de " + totalVocales + " vocales introducidas");



    }
}
