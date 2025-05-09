package animales;

public class Conejo extends Animal {
    //Atributos


    private int tamañoOrejas;
    private String pelaje;



    //Constructor
    public Conejo(String nombre, int edad,float peso, boolean hembra,float kilosComidaSemanal, String cuidador, int area,int tamañoOrejas, String pelaje){

        super(nombre, edad,peso,hembra, kilosComidaSemanal,cuidador,area);
        this.tamañoOrejas=tamañoOrejas;
        this.pelaje=pelaje;



    }


    //Getter

    public int getTamañoOrejas(){
        return tamañoOrejas;
    }
    public String getPelaje(){return pelaje;}

    //Setter

    public void setTamañoOrejas(int tamañoOrejas){this.tamañoOrejas=tamañoOrejas;}
    public void setPelaje(String pelaje){this.pelaje=pelaje;}


    //toString
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("Tamaño de las Orejas: ").append(tamañoOrejas).append("\n");
        sb.append("Pelaje: ").append(pelaje).append("\n");

        return sb.toString();
    }
}
