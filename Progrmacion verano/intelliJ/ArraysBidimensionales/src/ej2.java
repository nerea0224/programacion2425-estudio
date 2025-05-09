import java.util.Random;

public class ej2 {
    public static void main(String[] args) {
         /* 2.Hacer un programa que:
        -Un array bidimensional de longitud 6x8 de nombre “matrículas” donde las filas representan grupos de alumnos
            y las columnas asignaturas
        - Un segundo array bidimensional de longitud 8x13 de nombre “asignaturas” donde cada fila se corresponde con
            el nombre de una asignatura (Álgebra, Cálculo, Programación, Inglés, Estadística, Física, Historia, Tecnología)
            (Nota: inicializarlo de tal manera que ocupen todos los nombre como el máximo que es programación (13 caracteres))
        -Mostrar en pantalla una tabla con el total de alumnos matriculados por asignatura
    */
        Random random = new Random();
        int[][] matriculas=new int[6][8];
        char[][] asignaturas=new char[8][13];



        //matriculas
        for (int i = 0; i < matriculas.length ; i++) {
            for (int j = 0; j <matriculas[i].length ; j++) {
                matriculas[i][j]= random.nextInt(0,20);

            }
        }

        for (int i = 0; i < matriculas.length ; i++) {
            for (int j = 0; j <matriculas[i].length ; j++) {
                System.out.print(matriculas[i][j] + " ");

            }
            System.out.println();
        }

        //asignaturas
        for (char i = 0; i < asignaturas.length ; i++) {
            for (char j = 0; j <asignaturas[i].length ; j++) {
                asignaturas[i][j]={"Álgebra", "Cálculo", "Programación", "Inglés", "Estadística", "Física", "Historia", "Tecnología"};

            }
        }



    }
}
