package estudioMetodos.ejercicioMetodos;

public class ConParametrosConRetorno {
    public static void main(String[] args) {

        double div=dividir(4,2); //aqui iniciamos una variable que es igual al metro dividir y le metemos los parametros
        System.out.println(div);
        div=dividir(4,0); //aqui reusamos la variable y le metemos otros parametros para que se meta por los dos canales del 'if'
        System.out.println(div);


    }
    public static double dividir(double y, double x){
        double division=0; //inicializamos variable
        if (x>0){
             division=y/x;
        }else {
            System.out.println("No se puede dividir por 0 o negativos");

        }

        return division;

    }

}
