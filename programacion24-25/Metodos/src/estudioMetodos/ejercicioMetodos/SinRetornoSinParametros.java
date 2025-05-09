package estudioMetodos.ejercicioMetodos;

import javax.swing.*;

public class SinRetornoSinParametros {
    public static void main(String[] args) {
        //aqui podemos poner tambien nuevas variables


        //llamamos al metodo
        sumar();
    }

    //El metodo se escribe fuera del main, en el main llamamos al metodo

    public static void sumar(){ //ponemos static para poder entrar al metodo desde el main. 'SUMAR()' es como se llama nuestro metodo
        System.out.println("Inserta el metodo");
         int a = Integer.parseInt(JOptionPane.showInputDialog("Inserta a"));
         //'Integer'= int          'JOptionPane.showInputDialog()' es como 'System.out.println()' pero sale un cuadro de texto
        //JOptionPane.showInputDialog(), es una ventana emergente
         int b = Integer.parseInt(JOptionPane.showInputDialog("Inserta b"));

         int suma=a+b;
        System.out.println("El valor de 'a' es: " + a +"\n El valor de 'b'es : " + b);
        System.out.println("la suma es: " + suma);
    }
}
