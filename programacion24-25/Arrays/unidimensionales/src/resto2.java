public class resto2 {
    public static void main(String[] args) {
        int num1=10;
        int suma=0;

        for (int i = 1; i < num1 ; i++) {
            if (num1%i==0){
                suma+=i;

            }

        }
        if (suma<num1){
            System.out.println("es deficinete");
        }


       /* // amigos
        int num1=51651;
        int num2=5455;
        int num3=45712;
        int suma=0;

        for (int i = 1; i <num1 ; i++) {
            if (num1%i==0){
                suma=suma+i;
            }

        }
        if (suma==num2 || suma==num3)*/


    }
}
