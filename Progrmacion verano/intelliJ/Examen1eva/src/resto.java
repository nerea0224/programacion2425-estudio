public class resto {
    public static void main(String[] args) {
        //un numero es deficiente cuando la suma de sus dividores es menor que el
        int num1=10;
        int suma=0;

        for (int i = 1; i < num1 ; i++) {
            System.out.println(i);
            if (num1%i==0){
                suma+=i;

            }

        }
        if (suma<num1){
            System.out.println("es deficinete");
        }
    }
}
