public class Perro {

    private String nombre;
    private int años;

    //contructor

    public Perro(String nombre, int años) {
        this.nombre = nombre;
        this.años = años;
    }


    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public int getAños() {
        return años;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;

    }

    public void setAños(int años){
        this.años=años;
    }


    //toString

    /*@Override
    public String toString() {
        StringBuilder sb=new StringBuilder("perro: ");

        sb.append("nombre: ") .append(nombre);
        sb.append("años: ") .append(años);

        return sb.toString() ;

    }*/

    @Override
    public String toString() {
        return "Perro{" + "nombre='" + nombre + '\'' + ", años=" + años + '}';
    }
}
