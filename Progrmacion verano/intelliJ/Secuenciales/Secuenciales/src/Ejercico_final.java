public class Ejercico_final {
    public static void main(String[] args) {
        //Ejercicio Final: Conversión a Mayúsculas y Longitud de un Array de String
        //Escribe un programa que tome un array de cadenas(Strings),
        // convierta cada cadena a mayúsculas y luego imprima cada cadena en mayúsculas junto con su longitud.
        // Nuestro Array de Strings sera:  String[] palabras = {"hola", "mundo", "esto", "es", "java"};

        String[] palabras = {"hola", "mundo", "esto", "es", "java"};

        //Imprimiendo cadenas en mayusculas
        System.out.print(palabras[0].toUpperCase() + "  ");
        System.out.print(palabras[1].toUpperCase() + "  ");
        System.out.print(palabras[2].toUpperCase() + "  ");
        System.out.print(palabras[3].toUpperCase() + "  ");
        System.out.print(palabras[4].toUpperCase() + "  ");

        //Imprimir cadena en mayusculas + logitud

        System.out.println("\n" + palabras[0].toUpperCase() +"->" + palabras[0].length());
        System.out.println(palabras[1].toUpperCase() +"->" + palabras[1].length());
        System.out.println(palabras[2].toUpperCase() +"->" + palabras[2].length());
        System.out.println(palabras[3].toUpperCase() +"->" + palabras[3].length());
        System.out.println(palabras[4].toUpperCase() +"->" + palabras[4].length());

    }
}
