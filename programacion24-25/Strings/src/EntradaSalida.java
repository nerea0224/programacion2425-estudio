import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaSalida {
    public static void main(String[] args) throws IOException {

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    //nos permite leer un string
        System.out.println("Introduce un nombre");
        String nombre = lector.readLine();
        System.out.println("Introduce un número");
        String entradaNumero = lector.readLine();
        int numero = Integer.parseInt(entradaNumero);
        System.out.println(numero * numero);
    }
    //
}
