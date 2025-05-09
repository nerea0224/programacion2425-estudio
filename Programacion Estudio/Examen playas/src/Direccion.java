public class Direccion {
    private String calle;
    private String cp;
    private String comunidad;

    public Direccion(String calle, String cp, String comunidad) {
        this.calle = calle;
        this.cp = cp;
        this.comunidad = comunidad;

    }
    public Direccion() {
        this.calle = "San cucufato";
        this.cp = "28031";
        this.comunidad = "Murcia";
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }


}
