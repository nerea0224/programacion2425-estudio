package estudioMetodos.ejercicioMetodos;

import javax.swing.*;

public class procesos {
    double totalAPagar;

    public void iniciar() {

        for (int i = 0; i < 3; i++) {
            pedirDatos();

        }


    }

    public void pedirDatos() {
        //Inicializamos las variables al cuadro de texto donde ingresaremos su valor para que no nos pida que la inicialicemos y no nos de error
        double tratamiento = Double.parseDouble(JOptionPane.showInputDialog("Inserta el precio del tratamiento"));
        double madicamentos = Double.parseDouble(JOptionPane.showInputDialog("Inserta el precio de los medicamentos"));
        int diasHospitalizado = Integer.parseInt(JOptionPane.showInputDialog("Inserte los dias que ha estado hospitalizado"));
        int precioDia = 100000;
        String jubilado = JOptionPane.showInputDialog("Inserta 'si', si estas jubilado");

        calcularTotal(tratamiento, madicamentos, diasHospitalizado, precioDia);
        double resultado = calcularDescuento(jubilado);

        imprimirResultado(resultado);

    }

    private void imprimirResultado(double resultado) {
        String cadena = "Total a pagar:  \n";
        cadena += "El valor total a pagar es: " + totalAPagar + "\n";
        cadena += "Con el descuento seria: " + resultado;

        System.out.println(cadena);
    }

    public void calcularTotal(double tratamiento, double medicamentos, int diasHospitalizado, int precioDia) {

        int pagarDia = diasHospitalizado * precioDia;
        totalAPagar = tratamiento + medicamentos + pagarDia;

        System.out.println("el tratamiento es: " + totalAPagar);


    }

    public double calcularDescuento(String jubilado) {

        double precioFinal = 0;

        if (jubilado.equalsIgnoreCase("si")) {
            precioFinal = totalAPagar - (totalAPagar * 0.1);

        } else {
            precioFinal = totalAPagar - (totalAPagar * 0.05);

        }
        return precioFinal;

    }
}
