package domain;

public class UsuarioDomain {
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String email;
    private String cp;
    private String dni;
    private String contrasenya;

    //CONSTRUCTOR

    public UsuarioDomain(String nombre, String apellidos, String nombreUsuario, String email, String cp, String dni, String contrasenya) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.cp = cp;
        this.dni = dni;
        this.contrasenya=dni; //aqui decimos que la contraseña por defecto es el dni del usuario
    }
    public UsuarioDomain(){

    }

    //GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContrasenya() {
        return contrasenya;
    }
 /*en el set metemos como parametro de entrada la Nueva contraseña para poder ambiarla despues*/
    public void setContrasenya(String nuevaContrasenya) {
        this.contrasenya = nuevaContrasenya;
    }


}
