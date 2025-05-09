public class ej1metodos {
    public static void main(String[] args) {

        //esDeficiente(12);



        // deficientes
        //suma de los divisores de un numero
        String deficiente="esDeficiente";
        String noDeficiente="noEsDeficiente";


        for (int i = 1; i <=100 ; i++) {

            esDeficiente(i,deficiente, noDeficiente);

        }

    }

    /*public static int esDeficiente(int num) {

        int suma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;

            }

        }
        if (suma < num) System.out.println("es deficinete");
        else System.out.println("no es deficiente");


        return 0;*/





    public static int esDeficiente(int num, String cadena1, String cadena2){

        int suma=0;

        for (int i = 1; i < num ; i++) {
            if (num%i==0){
                suma+=i;

            }

        }
        if (suma<num){
            System.out.println(cadena1);
        }else System.out.println(cadena2);

        return 0;




    }
}

