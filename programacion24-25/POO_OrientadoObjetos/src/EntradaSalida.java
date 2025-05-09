import java.util.Scanner;

public class EntradaSalida {
    public static Mono dameMono(){
        Mono nuevoMono=null;
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce: 1.mono estandar 2.mono personalizado");
        int opcion= read.nextInt();
        read.nextLine();//lo ponemos para leer el enter y que no se nos meta al codigo
        if (opcion==1){
            nuevoMono=new Mono();

        }else{
            nuevoMono= new Mono();

        }
        return nuevoMono;
    }
}
