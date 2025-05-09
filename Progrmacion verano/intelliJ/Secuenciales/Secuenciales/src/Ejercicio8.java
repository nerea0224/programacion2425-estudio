import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        // 8.	Hacer un programa que pida la longitud de dos lados de un rectángulo C1 y C2,
        // y que calcule el perímetro y el área.
        // Calcular la longitud de la diagonal,
        // y después el área del triángulo que forman los dos lados con la diagonal .

        Scanner read = new Scanner(System.in);

        int c1;
        int c2;


        System.out.println("Indica la longitud de los lados C1 Y C2");
        c1=read.nextInt();
        c2=read.nextInt();

        System.out.println("La longitus de los lados es: " + "\n" + c1 + "\n" + c2 );


        //Calcular perimero de rectangulo. Perimetro=2*(c1+c2)

        double perimetro=2*(c1+c2);
        System.out.println("El perimetro es: " + perimetro);

        //Calcular area de rectangulo. Area=c1*c2

        double area=c1*c2;
        System.out.println("El area es: " + area);


        // Calcular la diagonal. Diagonal= Math.sqrt((Math.pow(c1,2))+(Math.pow(c2,2)))

        double diagonal= Math.sqrt((Math.pow(c1,2))+(Math.pow(c2,2)));
        System.out.println("La diegonal es: " + diagonal);

        //Calcular area del triangulo de la diagonal. AreaTriangulo=(c1*c2)/2

        double AreaTriangulo= (double) (c1 * c2) /2;
        System.out.println("El area del triangulo es: " + AreaTriangulo);
    }
}
