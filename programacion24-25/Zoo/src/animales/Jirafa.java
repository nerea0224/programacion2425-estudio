package animales;

public class Jirafa extends Animal {
    //Atributos

    private int longitudCuello;


    //Constructor
    public Jirafa(String nombre, int edad,float peso, boolean hembra,float kilosComidaSemanal, String cuidador,int area, int longitudCuello) {
        super(nombre, edad,peso,hembra, kilosComidaSemanal,cuidador,area);
        this.longitudCuello=longitudCuello;
    }

    public Jirafa(){
        super();
    }



    //Getter

    public int getLongitudCuello(){
        return longitudCuello;
    }

    //Setter

    public void setLongitudCuello(int longitudCuello){this.longitudCuello=longitudCuello;}


    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("longitud del cuello: ").append(longitudCuello).append("\n");

        return sb.toString();
    }
}
