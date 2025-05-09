import java.util.Arrays;
import java.util.Random;

public abstract class Playa {
    private int id;
    private String nombre;
    private double longitud;
    private int[] valoracion = new int [10];
    private Direccion direccion;

    public Playa(int id, String nombre, double longitud, int[] valoracion, Direccion direccion) {
        //constructor por defecto
        this.id = id;
        this.nombre = nombre;
        this.longitud = longitud;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public Playa() {
        //constructor hecho por mi
        Random random = new Random(); //creo random
        this.id = random.nextInt(0,1000); //random de id's
        this.nombre = "playiturrinonga"; //nombre de mi playa
        this.longitud = random.nextDouble(0.1,21); //random de la longitud de la playa
        //mediente Lamda hago un bucle, para que las valoraciones de las playas sean aleatorias de 1 a 6
        for (int i:valoracion) {
            this.valoracion[i]= random.nextInt(1,6);
        }
        Direccion direccion1=new Direccion(); //creo una nueva instancia direccion

        /*si yo llamo a playa desde el main/tester me sale "PLAYITURRINONGA"*/
    }

    //GETTER Y SETTER
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

    public abstract double valoracionMedia(); //cala y playa grande tienen que tener este metodo

    public abstract double getPuntuacion();//cala y playa grande tienen que tener este metodo
    //TO STRING
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("===PLAYA==").append("\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Longitud: ").append(longitud).append("\n");
        sb.append("Valoracion: ").append(Arrays.toString(valoracion)).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");

        return sb.toString();
    }
}
