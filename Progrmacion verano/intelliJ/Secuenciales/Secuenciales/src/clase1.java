public class clase1 {
    public static void main(String[] args) {

        String[] dias = new String[7];

        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "X";
        dias[3] = "JUE";
        dias[4] = "Vier";
        dias[5] = "SAB";
        dias[6] = "Dom";

        //System.out.println(dias[0].charAt(0));
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i].charAt(0));

        }
    }
}
