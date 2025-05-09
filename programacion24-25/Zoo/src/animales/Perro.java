package animales;

public class Perro extends Animal{


        private String raza;


    public Perro(String nombre, int edad, float peso, boolean hembra, float KilosComidaSemanal, String cuidador, int area, String raza) {
        super(nombre, edad, peso, hembra, KilosComidaSemanal, cuidador, area);
        this.raza = raza;

    }

    @Override
    public String getNombre() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.raza = nombre;
    }




    @Override
    public String toString() {
        return "Perro:" +
                "\n raza=" + raza + "\n" + super.toString();
    }
}


