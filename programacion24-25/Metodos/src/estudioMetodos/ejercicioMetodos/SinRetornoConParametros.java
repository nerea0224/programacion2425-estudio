package estudioMetodos.ejercicioMetodos;

public class SinRetornoConParametros {
    public static void main(String[] args) {
        //llamamos al metodo. los parametros tienen que ir en el mismo orden que estan en el metodo escritos.

        restar(8,4);
        //como es con parametros, meto los numeros dentro del parentesis, asi le digo los parametros que quiero que reste.


    }

    public static void restar(int x, int y) {
        //metemos los parametro dentro del metodo 'restar'.
        int resta=x-y;

        System.out.println("el valor de 'x' es: " + x + ", el valor de 'y' es: " + y);
        System.out.println("la resta es: " + resta);
    }


}
