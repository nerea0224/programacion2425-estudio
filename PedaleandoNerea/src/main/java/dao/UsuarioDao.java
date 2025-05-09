package dao;

import domain.UsuarioDomain;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    //guardar nuevo usuario , buscar usuario , eliminar usuario , añadir usuario...
    //crear el array list pata guardar usuarios
    private List<UsuarioDomain> listaUsuarios = new ArrayList<>();

    //GUARDAR USUARIOS
    public void guardarUsuario(UsuarioDomain nuevoUsuario) {
        /*en este metodo vamos a ir guardando los usuarios que se vayan registrando en nuestra app, para ello le metemos nuestra clase usuarioDomain (getter,setter)
         * como parametro de entrada, asi le entran todos los datos del usuario registrado y guardado*/
        listaUsuarios.add(nuevoUsuario);//aqui le decimos que nos añada a la lisat al usuario
        System.out.println("Usuario guardado correctamente en memoria");
    }
    //YA EXISTENTE ESE NOMBRE DE USUARIO, DNI O EMAIL
    public String yaExiste(String dni, String nombreUsuario, String email){
      for (UsuarioDomain usuario : listaUsuarios){
          if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)){
              return "Ya existe un usuario con ese nombre";
          } else if (usuario.getDni().equalsIgnoreCase(dni)) {
              return "Ya existe un usuario con ese dni";
          }else if (usuario.getEmail().equalsIgnoreCase(email)){
              return "Ya existe un usuario con ese email";
          }
      }
      return null; // no hay duplicados de nombreUsuario, dni o email
    }

    //BUSCAR POR NOMBRE DE USUARIO
    public UsuarioDomain buscarPorNombreUsuario(String nombreUsuario){
        for (UsuarioDomain usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return usuario;
            }
        }
        return null; // usuario no encontrado

    }


    //BUSCAR POR CREDENCIALES
    //Buscar por NombreUsuario y DNI para inicio de sesion
    public UsuarioDomain buscarPorCredenciales(String nombreUsuario, String dni) {
        //Le decimos que el metodo BuscarPorCredenciales es de tipo UsuarioDomain (clase getter,setter)
        //le metemos el nombre de usuario y el dni como parametro de entrada
        for (UsuarioDomain usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && usuario.getDni().equals(dni)) {
                return usuario;
            }
        }
        return null; //usuario no encontrado
    }

    //CAMBIO NOMBRE USUARIO
    public UsuarioDomain cambiarNombreUsuario(String nombreUsuario, String email){
        for (UsuarioDomain usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario) || usuario.getEmail().equalsIgnoreCase(email)) {
                return usuario;
            }
        }
        return null; // usuario no encontrado
    }

    // ELIMINAR CUENTA
    public boolean eliminarCuenta(String nombreUsuario){
        for (UsuarioDomain usuario : listaUsuarios){
            if (usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario)){
                listaUsuarios.remove(usuario); //remove lo que hace es borrar completamente todo lo del usuario de la lista
                return true;
            }
        }
        return false;
    }


}

