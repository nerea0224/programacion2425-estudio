import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        // 14.	Un alumno desea saber cual será su calificación final en la materia de Algoritmos.
        // Dicha calificación se compone de los siguientes porcentajes:
        //	55% del promedio de sus tres calificaciones parciales.
        //  30% de la calificación del examen final.
        //	15% de la calificación de un trabajo final.

        Scanner read = new Scanner(System.in);

        //promedio calificaciones parciales
        int nota1;
        int nota2;
        int nota3;

        System.out.println("Escribe las tres notas de los parciales");
        nota1=read.nextInt();
        nota2=read.nextInt();
        nota3=read.nextInt();

        double promedio=(((nota1+nota2+nota3)/3) * 0.55);

        System.out.println("La media de los 3 parciales es: " + promedio);



        //Calificacion examen final (30%)

        int NotaExamen;

        System.out.println("Escribe la nota de tu examen final");

        NotaExamen= read.nextInt();

        double E_Final= (NotaExamen * 0.30);

        System.out.println("El 30% de la nota de tu examen final es: " + E_Final);


        //Calificacion trabajo final (15%)

        int NotaTrabajo;

        System.out.println("Escribe la nota de tu trabajo final");
        NotaTrabajo=read.nextInt();

        double NotaTFinal= (NotaTrabajo * 0.15);

        System.out.println("El 15% de tu nota del trabajo final es: " + NotaTFinal);

        //Nota final de Algoritmos

        double algoritmos= (promedio + E_Final + NotaTFinal);

        System.out.println("Tu nota final de algoritmos es: " + algoritmos);


    }
}
