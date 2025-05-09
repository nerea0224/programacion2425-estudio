import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {

        //Para leer Strings con 'Scanner read = new Scanner(System.in);' se usa 'read.nextLine();'


       /* // 1. SUBSTRING

         String cadena = "Hola"; //se declara el String
       String cadena2 = cadena.substring(0,1);//Aqui indicamos de donde hasta donde queremos que se imprima (Imprime una H)
       System.out.println(cadena);//Imprimimos la cadena
        System.out.println(cadena2);//aqui se imprime cadena 2
       System.out.println(cadena.length());//Nos cuenta el numero de caracteres que tiene el String

       //El subString es como si hicieramos cadena += ", qué tal?";   ->   cadena = cadena + ", qué tal?"; */



        /* // 2. INDEXOF

        //El idexof sirve para buscar un caracter entro de una frase, pero no te dice si se repite o no, sino la posicion de la primera vez que encuetra el caracter

        String cadena = "Hola"; //Declaracion del String
        System.out.println(cadena.indexOf("*"));//Aqui le decimos que nos busque en el String un asterisco, como no hay devuelve '-1'
        System.out.println(cadena.indexOf("H"));//Aqui le decimos que nos busque una H, nos da la posicion '0'*/



        /*// 3. CONCAT

        //contat sirve para unir (concatenar) Strings

        String cadena = "Hola"; //se declara el String
        cadena = cadena.concat(",qué tal?");//Aqui concatenamos (unimos) el 'Hola + ,qué tal?'
        String cadena2 = "Nerea";
        System.out.println(cadena);// se imprime 'Hola, qué tal?
        System.out.println(cadena.length());//Nos imprime con '.length' el numero de caracteres que tiene el String
        cadena = cadena.concat(cadena2);//Aqui le decimos que nos una lo que hemos unido antes a cadena, mas cadena2
        System.out.println(cadena); //aqui imprimimos 'Hola, qué tal?Nerea

        //Esto es para sacar la palabra "qué" sin ponerle explícitamente la posición dónde está
        System.out.println(cadena.substring(cadena.indexOf("qué"), cadena.indexOf("qué") + 3));
            //1º ubicamos donde esta el 'qué' (en subStrin)
            //2º Dentro del subString ponemos 'indexof' y le indicamos que queremos buscar (en este caso el 'qué')
            //3º separamos por "coma" y con cadena.indexof indicamos la palabra +los caracteres que la componen*/



        /*// 4. EQUALS

            //Se usa para comparar si una cosa esigual a otra, NO se usa '=='

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = read.nextLine();
        System.out.println("Introduce su password");
        String password = read.nextLine();
        System.out.println("Introduce usuario");
        String usuario2 = read.nextLine();

        if (usuario2.equals(usuario1)){ //aqui comparamos si son iguales los usuarios
            System.out.println("Usuarios coinciden");
        }else {
            System.out.println("Los usuarios no coinciden");
        }*/



       /* // 5. EQUALSIGNORECASE

            //Se utiliza para conparar si 2 Strings son iguales ignorando si los caracteres estan en mayusculas o minusculas

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = read.nextLine();
        System.out.println("Introduce usuario");
        String usuario2 = read.nextLine();

        if (usuario2.equalsIgnoreCase(usuario1))
            System.out.println("Usuarios coinciden");*/



        /*// 6. COMPARETO

        //Se usa para comparar 2 cadenas y devuelve la diferenia entre unay otra comparando contabla assci o diferecia de caracteres

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = read.nextLine();
        System.out.println("Introduce usuario");
        String usuario2 = read.nextLine();

        System.out.println(usuario1.compareTo(usuario2));
        //Aqui comparamos que diferencia hay entre usuario 1 y 2
        //Si ponemos 'casa' y 'caserio' nos devuelve un '-4' porque hay 4 letras de diferencia
        // Si ponemos 'A' y 'A' nos devuelve un '0' porque son iguales
        //Si ponemos 'A' y 'a' nos devuelve un '-32' que es a diferencia numeria en ASCII*/



        /*// 7. TOUPPERCASE

            //Se utiliza para poner todas las letras en mayuscula

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = read.nextLine();

        System.out.println(usuario1.toUpperCase());//Aqui cambiamos todos los caracteres introducidos a mayuscula*/



        /*// 8. TOLOWERCASE

            // //Se utiliza para poner todas las letras en minusculas

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = read.nextLine();

        System.out.println(usuario1.toLowerCase());//Aqui cambiamos todos los caracteres introducidos a minusculaSGF*/



        /* // 9. REPLACE

            // Se utiliza para reempplazar un caracter por otro

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = read.nextLine();
        System.out.println("Introduce usuario");
        String usuario2 = read.nextLine();

        System.out.println(usuario2.replace('a','e'));
        //aqui indicamos que queremos cambiar en el usuario2 la 'a', por la 'e'
        //Usuario1 se queda igual */


        /* // 10.  SPLIT

            //Se usa para dividir una cadena en subcadenas o caracteres

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce frase");
        String frase = read.nextLine();

        String[] trozos = frase.split(" ");
        //aqui hacemos un array de String llamado 'trozos', le decimos que es = a la frase introducida y que nos cuente los trozos por los espacios que haya.
        System.out.println(trozos.length);
        //Aqui le decimos con el 'trozos.length' que nos imprima la cantidad de palabras o caracteres que tiene la frase separadas por espacios */


       /* // 11. HASNEXT

        // Se utiliza para saber si hay algo despues (un elemento futuro). Si hay algo despues del espacio o enter, continua si no hay nada, finaliza el bucle
        //SIEMPRE que usemos 'hasNext' a la hora de leerlo con es scanner se lee 'read.next()' (nombre del scanner + .next())

        Scanner read = new Scanner("HOla asdf asdf           asdf sadf");
        //Aqui indicamos la frase. Le ponemos varios espacios que va a reconocer como uno solo
        int i = 0;
        //aqui inicializamos una variable que recorra la frase
        while (read.hasNext()) { //Aqui decimos que mientras haya siguiente palabra
            System.out.println(read.next()); //aqui la imprimes


            i++; //aqui le decimos que nos cuente las palabras o caracteres


        }
        System.out.println(i); //Aqui imprimimos el total de palabras o caracteres
        //Se hace fuera del bucle para tener un total y que no nos lo cuente en cada vueelta*/
    }
}