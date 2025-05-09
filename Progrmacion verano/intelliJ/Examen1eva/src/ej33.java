public class ej33 {
    public static void main(String[] args) {

        int x=0;
        int y=0;
        boolean exit=false;

        //System.out.print(x +" "+y +" "+z);
        for (char z = 'a'; z <= 'z' && !exit; z++) {

            System.out.println(x+" "+ y + " " +z);

           if (z=='z'){
               z=96;
               y++;
           }
           if (y ==10) {
               y=0;
               x++;
           }

           if (x==10){
               exit=true;
           }

        }

    }
}
