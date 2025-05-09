import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        //16.El dueño de una tienda compra un artículo a un precio determinado.
        // Obtener el precio en que lo debe vender para obtener una ganancia del 30%.

        Scanner read = new Scanner(System.in);

        double precio;

        System.out.println("Introduce el precio del articulo");
        precio=read.nextDouble();

        double PrecioFinal=((precio * 30) /100);

        System.out.println("El aumento del producto es de: " + PrecioFinal);

        System.out.println("El precio de venta para tener un 30% de ganancias es: " + (PrecioFinal+precio));

    }
}
