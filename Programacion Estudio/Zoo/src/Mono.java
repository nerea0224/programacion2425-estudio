import org.w3c.dom.ls.LSOutput;

public class Mono {

        private String nombre;
        private int edad;
        private float peso;
        private boolean hembra;
        private String tipo;
        private float kilosComidaSemanal;
        private String cuidador;

    public Mono( int edad, float peso, boolean hembra, String tipo, float kilosComidaSemanal, String cuidador) {

        this();
        this.edad = edad;
        this.peso = peso;
        this.hembra = hembra;
        this.tipo = tipo;
        this.kilosComidaSemanal = kilosComidaSemanal;
        this.cuidador = cuidador;

    }
        public Mono(String nombre, int edad, float peso, boolean hembra, String tipo, float kilosComidaSemanal, String cuidador) {

            this.nombre = nombre;
            this.edad = edad;
            this.peso = peso;
            this.hembra = hembra;
            this.tipo = tipo;
            this.kilosComidaSemanal = kilosComidaSemanal;
            this.cuidador = cuidador;

        }
        public Mono(){

            this.nombre="miMonoPreferido";
            this.edad=(int)(Math.random()*100);
            this.peso=15;
            this.hembra=true;
            this.tipo="Gorila";
            this.kilosComidaSemanal=2;
            this.cuidador="yoMismo";
        }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isHembra() {
        return hembra;
    }

    public String getTipo() {
        return tipo;
    }

    public float getKilosComidaSemanal() {
        return kilosComidaSemanal;
    }

    public String getCuidador() {
        return cuidador;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setHembra(boolean hembra) {
        this.hembra = hembra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setKilosComidaSemanal(float kilosComidaSemanal) {
        this.kilosComidaSemanal = kilosComidaSemanal;
    }

    public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
    }

    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("Nombre: ").append(nombre).append("\n");
            sb.append("Edad: " + edad + "\n");
            sb.append("Peso: " + peso + "\n");
            sb.append("Hembra: " + hembra + "\n");
            sb.append("Tipo: " + tipo + "\n");
            sb.append("Kilos: " + kilosComidaSemanal + "\n");
            sb.append("Cuidador: " + cuidador + "\n");
            sb.append("\n");

            return sb.toString();
    }
}
