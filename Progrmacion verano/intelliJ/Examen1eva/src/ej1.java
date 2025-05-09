public class ej1 {
    public static void main(String[] args) {

        int num = 100;
        int suma = 0;

        // va desde desde 1 hasta 100
        for (int i = 1; i <= num; i++) {

            // Calcular la suma de los divisores propios
            for (int j = 1; j < i; j++) {
                if (i % j == 0) { // Si j es divisor de i
                    suma += j;
                }
            }

            // Ver si el número es deficiente
            if (suma < i) {
                System.out.println(i + " es deficiente");
            }else {
                System.out.println(i + " No es deficiete");
            }
            suma=0;
        }
    }
}


