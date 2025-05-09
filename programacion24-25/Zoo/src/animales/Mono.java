package animales;

public class Mono extends Animal {

    //Atributos

    private String tipo;


    //Constructor
    public Mono(String nombre, int edad,float peso, boolean hembra,float KilosComidaSemanal, String cuidador,String tipo,int area){

        super(nombre, edad,peso,hembra, KilosComidaSemanal,cuidador,area);
        this.tipo=tipo;


    }

    public Mono(){
        super();
    }

    //Getter

    public String getTipo(){
        return tipo;
    }

    //Setter

    public void setTipo(String tipo){this.tipo=tipo;}


    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("tipo: ").append(tipo).append("\n");

    return sb.toString();
    }
}
