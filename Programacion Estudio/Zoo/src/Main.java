public class Main {
    public static void main(String[] args) {
       Mono mono1 = new Mono ("copito",18,100,false,"Gorila",20,"paula");
       Mono mono2 = new Mono (3,8,false,"Chimpance",3, "mirella");
       Mono mono3 = new Mono ();

        System.out.println(mono1.getCuidador()); //llamamos a los cuidadores de los monos
        System.out.println("--------");
        System.out.println(mono2.getCuidador());
        System.out.println("--------");
        System.out.println(mono3.getCuidador());
        System.out.println("--------");
        System.out.println(mono1.toString()); //llamamos a toda la informacion de mono1
        System.out.println("--------");
        mono1.setCuidador("Ana");//Cambiamos el nombre del cuidador de mono1
        System.out.print(mono2.toString());

    }
}