public class Cala extends Playa{
    private boolean aptoMinusvalidos;

    public Cala(int id, String nombre, double longitud, int[] valoracion, Direccion direccion) {
        super(id, nombre, longitud, valoracion, direccion);

    this.aptoMinusvalidos=aptoMinusvalidos;
    }

    public Cala() {
        super();
        this.aptoMinusvalidos=false;

    }

    public boolean isAptoMinusvalidos() {
        return aptoMinusvalidos;
    }

    public void setAptoMinusvalidos(boolean aptoMinusvalidos) {
        this.aptoMinusvalidos = aptoMinusvalidos;
    }

    @Override
    public double valoracionMedia(){
        return 0;
    }
    @Override
    public  double getPuntuacion(){
        return 0;
    }


    @Override
    public String toString() {
        return "Cala{" +
                "aptoMinusvalidos=" + aptoMinusvalidos +
                '}';
    }
}
