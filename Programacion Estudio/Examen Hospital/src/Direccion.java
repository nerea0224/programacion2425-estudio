public class Direccion {
    private String calle;
    private String localidad;

    public Direccion (String calle, String localidad){
        this.calle=calle;
        this.localidad=localidad;
    }
    public Direccion(){}


    //GETTER
    public String getCalle() {
        return this.calle;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    //SETTER
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("======Direccion====== ").append("\n");
        sb.append("Calle: ").append(calle).append("\n");
        sb.append("Localidad: ").append(localidad).append("\n");
        sb.append("======================");
        return sb.toString();

    }
}
