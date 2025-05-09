import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestionPlayas listado = new GestionPlayas();

        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido a Gestion de playas");
        System.out.println("Quieres utilizar el numero de playas por defecto o especidicar un numero de playas a gestionar concreto? (si/no)");
        int respuesta = read.nextInt();
        read.nextLine();

        if (respuesta==1){
            listado = new GestionPlayas();
        } else if (respuesta==2) {
            System.out.println("Cuantas playas desea gestionar?");
            int tamanyo=read.nextInt();
            read.nextLine();
            listado =new GestionPlayas(tamanyo);
        }
        //apartir de aqui el menu

        //Hay hueco? case3
        if (listado.hayHueco()){
            System.out.println("hay hueco, añadiendo play...");
            listado.insertarPlaya(listado.anyadirPlaya());
        }else {
            System.out.println("no hay hueco");
        }








    }
}