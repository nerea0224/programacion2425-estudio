import java.util.Random;

public abstract class Playa {
    private int id;
    private String nombre;
    private double longitud;
    private int[] valoracion = new int [10];
    private Direccion direccion;

    public Playa(int id, String nombre, double longitud, int[] valoracion, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.longitud = longitud;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public Playa() {
        Random random = new Random();
        this.id = random.nextInt(0,1000);
        this.nombre = "playiturrinonga";
        this.longitud = random.nextDouble(0.1,21);
        for (int i:valoracion) {
            this.valoracion[i]= random.nextInt(1,6);
        }
        Direccion direccion1=new Direccion();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int[] getValoracion() {
        return valoracion;
    }

    public void setValoracion(int[] valoracion) {
        this.valoracion = valoracion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    //METODOS

    public abstract double valoracionMedia();

    public abstract double getPuntuacion();





}
