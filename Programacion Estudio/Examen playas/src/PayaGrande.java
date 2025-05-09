public class PayaGrande extends Playa {
    private String Bandera;


    public PayaGrande(int id, String nombre, double longitud, int[] valoracion, Direccion direccion, String bandera) {
        super(id, nombre, longitud, valoracion, direccion);
        this.Bandera = bandera;
    }

    public PayaGrande() {
        super();
        this.Bandera="Amarila";
    }

    public String getBandera() {
        return Bandera;
    }

    public void setBandera(String bandera) {
        Bandera = bandera;
    }

    //Metodos
    @Override
    public double valoracionMedia(){
        return 0;
    }
    @Override
    public double getPuntuacion(){
        return 0;
    }

    @Override
    public String toString() {
        return "PayaGrande{" +
                "Bandera='" + Bandera + '\'' +
                '}';
    }
}
