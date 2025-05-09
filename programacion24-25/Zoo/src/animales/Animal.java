package animales;

public class Animal {
    /*Para cualquier clase hay que hacer los tributos (encapsularlos y hacerlos privados), getter, setter y toString*/

    //Atributos
     private String nombre;
     private int edad;
     private float peso;
     private boolean hembra;
     private float kilosComidaSemanal;
     private String cuidador;
     private int area;

    //Constructores (se pone siembre 'this' y despues el atributo.)

    public Animal(String nombre, int edad,float peso, boolean hembra,float kilosComidaSemanal, String cuidador, int area){

        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.hembra=hembra;
        this.kilosComidaSemanal=kilosComidaSemanal;
        this.cuidador=cuidador;
        this.area=area;


    }

    public Animal(){


    }



    //GETTER

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public boolean getHembra() {
        return hembra;

    }

    public float getKilosComidaSemanal() {

        return kilosComidaSemanal;
    }

    public String getCuidador() {

        return cuidador;
    }

    public int getArea() {
        return area;
    }

    //SETTER

    public void setEdad(String nombre){this.nombre=nombre;}
    public void setedad(int edad){this.edad=edad;}

    public void setPeso(float peso) {this.peso = peso;}
    public void setHembra(boolean hembra) {this.hembra=hembra;}
    public void setKilosComidaSemanal(float kilosComidaSemanal){this.kilosComidaSemanal=kilosComidaSemanal;}
    public void setCuidador(String cuidador){this.cuidador=cuidador;}

    public void setArea(int area) {this.area = area;
    }
    //toString (toda la información del animales.Mono.mono)

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("nombre: ").append(nombre).append("\n");
        sb.append("edad: ").append(edad).append("\n");
        sb.append("peso: ").append(peso).append("\n");
        sb.append("hembra: ").append(hembra).append("\n");
        sb.append("kilosComidaSemanal: ").append(kilosComidaSemanal).append("\n");
        sb.append("cuidador: ").append(cuidador).append("\n");
        sb.append("area: ").append(area).append("\n");
        sb.append("\n");


        return sb.toString();
    }
}


