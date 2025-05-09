import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        //17.Tres personas deciden invertir su dinero para fundar una empresa.
        // Cada una de ellas invierte una cantidad distinta.
        // Obtener el porcentaje que cada quien invierte con respecto a la cantidad total invertida.

        Scanner read = new Scanner(System.in);

        int persona1;
        int persona2;
        int persona3;

        System.out.println("Inserta la inversion de las 3 personas");
        persona1=read.nextInt();
        persona2=read.nextInt();
        persona3=read.nextInt();

        System.out.println(" Las inversiones son: " + "\n" + persona1 + "\n" + persona2+ "\n" + persona3);

        int TotalInvertido= (persona1+persona2+persona3);

        System.out.println("El 100% invertido es: " + TotalInvertido);

        int InversionP1= (100*persona1)/TotalInvertido;
        int InversionP2= (100*persona2)/TotalInvertido;
        int InversionP3= (100*persona3)/TotalInvertido;

        System.out.println("La inversion en percentajes es: \n" + "1. " + InversionP1 + "%\n"+ "2. " + InversionP2 + "%\n"+ "3. " + InversionP3 + "%");
    }
}
