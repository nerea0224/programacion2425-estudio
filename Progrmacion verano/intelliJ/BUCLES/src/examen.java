import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, i, j, NUMERO;
        int POTENCIA;

        // Pedir al usuario el valor de N
        System.out.print("Introduce el valor de N: ");
        N = scanner.nextInt();

        // Pedir al usuario el número
        System.out.print("Introduce el número: ");
        NUMERO = scanner.nextInt();

        if (NUMERO >= 1) {
            for (i = 1; i <= N; i++) { // Cambiar a i=1 para iniciar desde 1
                System.out.println(); // Salto de línea
                POTENCIA = 1; // Inicializar POTENCIA como NUMERO^0

                for (j = 0; j < i; j++) {
                    System.out.print(POTENCIA + " "); // Imprimir la POTENCIA
                    POTENCIA *= NUMERO; // Actualizar POTENCIA
                }
            }
        } else {
            System.out.println("El número no es válido");
        }

        scanner.close(); // Cerrar el escáner
    }
}
