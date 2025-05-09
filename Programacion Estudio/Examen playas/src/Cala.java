public class Cala extends Playa{
    private boolean aptoMinusvalidos;

    public Cala(int id, String nombre, double longitud, int[] valoracion, Direccion direccion) {
        //llamo al super con los parametro sin el tipo de variable (Clase Playa)
        super(id, nombre, longitud, valoracion, direccion);

    this.aptoMinusvalidos=aptoMinusvalidos;
    }

    public Cala() {
        super();
        this.aptoMinusvalidos=false;

    }

    //GETTER
    public boolean isAptoMinusvalidos() {
        return aptoMinusvalidos;
    }
    //SETTER
    public void setAptoMinusvalidos(boolean aptoMinusvalidos) {
        this.aptoMinusvalidos = aptoMinusvalidos;
    }



    //METODOS
    @Override
    public double valoracionMedia(){
        return 0;
    }
    @Override
    public  double getPuntuacion(){
        return 0;
    }

 //TO STRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===CALA===").append("\n");
        sb.append("Apto para Minusvalidos: ").append(aptoMinusvalidos).append("\n");
        return sb.toString();
    }
}
