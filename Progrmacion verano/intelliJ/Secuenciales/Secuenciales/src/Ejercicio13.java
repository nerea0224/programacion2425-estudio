import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        //13.Una tienda ofrece un descuento del 15% sobre el total de la compra
        // y un cliente desea saber cuanto deberá pagar finalmente por su compra.

        Scanner read = new Scanner(System.in);

        double compra;

        System.out.println("Escribe cuanto te ha costado la compra");
        compra=read.nextDouble();

        double PrecioFinal=(compra * 0.15);
        System.out.println("Se le descuentan: " + PrecioFinal + "€");

        System.out.println("Debe pagar finalmente por su compra: " + (compra - PrecioFinal) + "€" );

    }
}
