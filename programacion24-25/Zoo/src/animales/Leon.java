package animales;

public class Leon extends Animal{

    //Atributos


    private boolean lider;


    //Constructor
    public Leon(String nombre, int edad,float peso, boolean hembra,float KilosComidaSemanal, String cuidador, int area, boolean lider){

        super(nombre, edad,peso,hembra, KilosComidaSemanal,cuidador,area);
        this.lider=lider;


    }

    public  Leon(){

        super();

    }

    //Getter

    public boolean getLider(){
        return lider;
    }

    //Setter

    public void setLider(boolean lider){this.lider=lider;}


    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("Lider: ").append(lider).append("\n");

        return sb.toString();
    }

}
