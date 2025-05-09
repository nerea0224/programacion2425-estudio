import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [][] num=new int[5][7];

        Random random = new Random();

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j]=random.nextInt(5,10);
            }
        }
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}