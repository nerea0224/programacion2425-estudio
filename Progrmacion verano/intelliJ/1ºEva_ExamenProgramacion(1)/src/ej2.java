import java.io.IOException;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) throws IOException {
        Scanner read=new Scanner(System.in);
        char caracter;

         boolean digito=false;
         boolean minuscula=false;
         boolean mayuscula=false;

         while(!(digito && minuscula && mayuscula)) {
             System.out.println("Inserte un caracter");

             caracter = read.next().charAt(0);

             if (caracter >= '0' && caracter <= '9') {
                 System.out.println("Es un digito");
                 digito=true;

             } else if (caracter >= 'a' && caracter <= 'z') {
                 System.out.println("Letra minuscula que pertenece al alfabeto y su codigo ascii es: " + (int) caracter);
                 minuscula=true;
             } else if (caracter >= 'A' && caracter <= 'Z') {
                 System.out.println("Letra mayuscula que pertenece al alfabeto y su codigo ascii es: " + (int) caracter);
                 mayuscula=true;
             } else {
                 System.out.println("sigue introduciendo caracter");
             }

         }
        System.out.println("Se ha introducido un digito, una letra minuscula y una letra mayusscula. Programa finalizado");


    }
}

