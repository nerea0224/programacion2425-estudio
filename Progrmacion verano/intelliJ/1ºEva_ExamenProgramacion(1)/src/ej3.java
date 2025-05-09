import java.util.Random;

public class ej3 {
    public static void main(String[] args) {

        Random random=new Random();

        int[] canastas= new int[10];
        int[] dorsal= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i <canastas.length ; i++) {
            canastas[i]= random.nextInt(0,100);

        }
        for (int i = 1; i <= dorsal.length; i++) {
            System.out.println(i);

        }







    }
}
