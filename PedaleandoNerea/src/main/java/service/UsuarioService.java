package service;

import dao.UsuarioDao;
import domain.UsuarioDomain;

public class UsuarioService {
    //REGISTRAR, VALIDAR, VALIDAR INICIO DE SESION...
    UsuarioDao dao = new UsuarioDao(); //creamos una instancia de dao para poder llamarle

    //REGISTRAR NUEVO USUARIO
    public String registrarUsuario(UsuarioDomain nuevoUsuario) {
       String duplicado = dao.yaExiste(nuevoUsuario.getDni(), nuevoUsuario.getNombreUsuario(), nuevoUsuario.getEmail());
        if (duplicado!=null){
            return "Error!, ya existe un usuario con " + duplicado + "duplicado.";
        }
       //si los datos introducidos son correctos, se guarda en el dao, metodo guardarUsuario()
        dao.guardarUsuario(nuevoUsuario);
        return "Usuario válido";
        /*En este metodo metemos como parametro de entrada Usuario Domain (clase con guetter y setter...), de esta menara le metemos todos los datos que tenemos del usuario.
         * para poder guardar al usuario, tenemos que crear una nueva instancia/objeto de dao. (desde el service tenemos que llamar al dao).
         * despues llamamos al dao y a su metodo Guardar Usuario, donde le metemos como parametro de entrada el usuario que queremos que nos guarde*/
    }

    //USUARIO CORRECTO, PARA INICIO DE SESION
    public boolean usuarioCorrecto(String nombreUsuario, String contrasenya) {
        /*Este metodo indica si el usuario existe, si existe devuelve el nombre y la contraseña de usuario (el dni por defecto)
         * este metodo lo usamos en ui (menu principal) para que el usuario inicie sesion. Si los datos introducidos son correctos, sale el menu de inicio de sesion*/
        UsuarioDomain usuario = dao.buscarPorCredenciales(nombreUsuario, contrasenya);
        return usuario != null;
    }

    //BUSCAR USUARIO POR NOMBRE
    public UsuarioDomain buscarUsuarioPorNombre(String nombreUsuario) {
        return dao.buscarPorNombreUsuario(nombreUsuario);
    }

    //CAMBIAR CONTRASEÑA
    public boolean cambiarcontrasenya(String nombreUsuario, String actual, String nueva) {
        UsuarioDomain usuario = dao.buscarPorCredenciales(nombreUsuario,actual);
        if(usuario!= null){
            usuario.setContrasenya(nueva);
            return true;
        }
        return false;
    }

    //CAMBIAR NOMBRE DE USUARIO
    public boolean cambiarNombreUsuario(String nombreUsuario, String nuevoNombreUsuario, String email){
        UsuarioDomain usuario = dao.cambiarNombreUsuario(nombreUsuario,email);
        if (usuario!=null){
            usuario.setNombreUsuario(nuevoNombreUsuario);
            return true;
        }
        return false;
    }

    //ELIMINAR CUENTA
    public boolean eliminarCuenta(String nombreUsuario){
        return dao.eliminarCuenta(nombreUsuario);
    }

}
