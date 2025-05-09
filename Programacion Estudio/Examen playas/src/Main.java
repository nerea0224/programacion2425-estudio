import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestionPlayas listado = new GestionPlayas();//me creo una instancia llamada listado de gestion de playas para poder llamar desde aqui

        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido a Gestion de playas. Que quieres hacer?");
        System.out.println("1 . Quieres utilizar el numero de playas por defecto)");
        System.out.println("2. especidicar un numero de playas a gestionar concreto");
        int respuesta = read.nextInt();
        read.nextLine();//leer el enter

        if (respuesta==1){
            listado = new GestionPlayas(); //le entrega la gestion de playas por defecto
        } else if (respuesta==2) {
            System.out.println("Cuantas playas desea gestionar?");
            int tamanyo=read.nextInt(); //creo un tamaño para saber las playas que quiere gestionar
            read.nextLine();
            listado =new GestionPlayas(tamanyo); //le digo que desde mi listado de gestion de playas me diga el tamanyo
        }
        //apartir de aqui el menu


        //Hay hueco? case3
        /*desde mi instancia "listado "creada arriba, llamo al metodo "hay hueco" */
        if (listado.hayHueco()){ //si hay hueco...
            System.out.println("hay hueco, añadiendo play...");//añado playa
            listado.insertarPlaya(listado.anyadirPlaya());//llamo desde listado a insertar playas y desde ahi a anyadir playas, para añadir mi playa
        }else { //si no hay hueco...
            System.out.println("no hay hueco");// no se añade
        }









    }
}