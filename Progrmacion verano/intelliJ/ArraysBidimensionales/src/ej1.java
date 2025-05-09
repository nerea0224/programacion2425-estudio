public class ej1 {
    public static void main(String[] args) {
       /* 12.	Hacer un programa que:
        1.	Cree un array bidimiensional de 5x15 elementos de tipo entero y nombre “marco”*/

        int[][] marco=new int[5][15];


        for (int i = 0; i < marco.length ; i++) {
            for (int j = 0; j <marco[i].length ; j++) {
                if (j == 0 || j==14) {
                    marco[i][j] = 1;

                } else if (i==0 || i==4) {

                    marco[i][j] = 1;
                }
            }

        }

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j <marco[i].length ; j++) {
                System.out.print(marco[i][j] + " ");

            }
            System.out.println();
        }

    }
}
