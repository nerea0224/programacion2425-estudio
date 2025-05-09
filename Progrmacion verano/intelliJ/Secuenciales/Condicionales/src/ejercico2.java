import java.util.Scanner;

public class ejercico2 {
    public static void main(String[] args) {
        // queremos que el ususario meta un nombre que empiece por mayuscula y que tenga una longitud maxima de 7.

        Scanner read = new Scanner(System.in);


        System.out.println("escribe tu nombre");
        String nombre = read.nextLine();

        if (nombre.charAt(0) > 'A' && nombre.charAt(0) < 'Z') {
            System.out.println("Mayuscula correcta");

        }
        if (nombre.length() <= 7) {
            System.out.println("La longitud es correcta");


        }

        System.out.println("Tu nombre es: " + nombre);
    }
}
