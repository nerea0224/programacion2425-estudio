package ui;

import common.Constantes;
import dao.UsuarioDao;
import domain.UsuarioDomain;
import service.UsuarioService;

import java.util.Scanner;

public class MenuPrincipal {
    // Atributos para guardar usuarioActual y usuarioService, esta en private para poder accedder desde todos los metodos
    private UsuarioDomain usuarioActual;
    private UsuarioService usuarioService;

    //MENU PRINCIPAL
    public void MenuPrincipal() {
        Scanner read = new Scanner(System.in);
        usuarioService = new UsuarioService();

        int opcion = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("--- BIENVENIDO A PEDALEANDO--- \n");
            System.out.print("Elige una opción: \n");
            System.out.println("1. Usuario \n");
            System.out.println("2. Administrador");
            System.out.println("3. salir");
            opcion = read.nextInt();
            read.nextLine();
            if (opcion < 1 || opcion > 3) {
                System.out.println("Introduce la opcion correcta");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("==USUARIO==");
                        menuUsuario(); /*aqui llamo al metodo menuUsuario para que me salga todo lo de la opcion usuario*/
                        break;
                    case 2:
                        System.out.println("==ADMINISTRADOR==");
                        //???
                        break;
                    default:
                        System.out.println("Saliendo... ");
                        exit = true;
                }
            }
        }

    }


    //MENU USUARIO...
    public void menuUsuario() {
        Scanner read = new Scanner(System.in);
        System.out.println("==USUARIO==");
        int opcion = 0;
        boolean exit = false;
        while (!exit) {
            System.out.print("Elige una opción: \n");
            System.out.println("1. Registrarse\n");
            System.out.println("2. Iniciar Sesion");
            System.out.println("3. Salir");
            opcion = read.nextInt();
            read.nextLine();
            if (opcion < 1 || opcion > 3) {
                System.out.println("Introduce la opcion correcta");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("== Registrarse ==");
                        System.out.println("Rellene los siguientes campos: ");
                        UsuarioDomain nuevoUsuario = registro(); //aqui decimos que nuevoUsuario de tipo UsuarioDomain es igual el metodo registro. El metodo registro, devuelve un nuevoUsario

                        /*creamos una nueva variable donde nos dice si se ha registrado o no el usuario.
                        hacemos un paseBolean porque el metodo registrarUsuario es un String y sino nos da error
                        */
                        boolean UsuarioRegistrado = Boolean.parseBoolean(this.usuarioService.registrarUsuario(nuevoUsuario));
                        if (UsuarioRegistrado) {
                            System.out.println("Usuario registrado correctamente. \n Debe iniciar sesión para poder usar la app. \n Gracias");
                        } else {
                            System.out.println("No se pudo registrar el usuario. Compruebe que DNI, nombre de usuario y correo no estén repetidos.");
                        }
                        break;
                    case 2:
                        System.out.println("==Iniciar Sesion==");
                        iniciarSesion();//Llamo al metodo para que me salga el menu de iniciar sesion
                        break;
                    default:
                        System.out.println("Saliendo...");
                        exit = true;
                }
            }
        }
    }

    //REGISTRO USUARIO
    //decimos que es un metodo publico de tipo Usuario domain (clase getter, setter)
    public UsuarioDomain registro() {
        Scanner read = new Scanner(System.in);
        //Nombre
        System.out.println("Nombre: ");
        String nombre = read.nextLine();
        //Apellido
        System.out.println("Apellido: ");
        String apellido = read.nextLine();
        //Nombre Usuario99999
        System.out.println("Nombre Usuario: ");
        String nombreUsuario = read.nextLine();
        //DNI
        System.out.println("DNI:  ");
        String dni = read.nextLine();
        //Código Postal
        System.out.println("Código Postal: ");
        String cp = read.nextLine();
        //Correo Electronico
        System.out.println("Correo Electrónico: ");
        String email = read.nextLine();
        //Contraseña
        System.out.println("Contraseña: "); //aqui le decimos que la contraseña por defecto es el dni
        String contrasenya = dni;

        //Creamos una instacia/objeto de nuevoUsuario de tipo UsuarioDomain, para crear un nuevo usuario con los datos que introduzcan
        //El usuario se crea aqui dentro, para poder recoger los datos del registro y asi no tener que llamarle
        UsuarioDomain nuevoUsuario = new UsuarioDomain(nombre, apellido, nombreUsuario, dni, cp, email, contrasenya);
        return nuevoUsuario; //devolvemos un nuevoUsuario y nos lo pinta en registro
    }


    //INICIAR SESION
    public void iniciarSesion() {
        Scanner read = new Scanner(System.in);
        //creamos una instacia de service para poder llamar a Usuario servicce
        UsuarioService service = new UsuarioService();
        //Nombre Usuario
        System.out.println("Inserte nombre de usuario: \n");
        String nombreUsuario = read.nextLine();
        //Contraseña
        System.out.println("Inserte contraseña: \n (si es la primera vez que ingresa en la app, su contraseña es el DNI)");
        String contrasenya = read.nextLine();
        if (service.usuarioCorrecto(nombreUsuario, contrasenya)) {
            /*aqui llamamos al metodo para que el nombre del usuario y la contraseña sean correctas e iguales al usuario.
            si es correcto, le sale el inicio de sesion, si no lo es, le sale que el usuario o la contraseña son incorrectos*/
            usuarioActual = usuarioService.buscarUsuarioPorNombre(nombreUsuario);
            System.out.println("Inicio de sesión correcto.");
            // Mostrar menú del usuario
            int opcion = 0;
            boolean exit = false;
            while (!exit) {
                System.out.println("Elige una opción \n");
                System.out.println("1. Gestionar cuenta");
                System.out.println("2. Reportar problemas");
                System.out.println("3. Gestionar Historial");
                System.out.println("4. Buscar bicicletas");
                System.out.println("5. salir");
                opcion = read.nextInt();
                read.nextLine();
                if (opcion < 1 || opcion > 5) {
                    System.out.println("Introduce la opcion correcta");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.println("==GESTIONAR CUENTA ==");
                            gestionarCuenta();
                            break;
                        case 2:
                            System.out.println("==REPORTAR PROBEMAS==");
                            reportarProblemas();
                            break;
                        case 3:
                            System.out.println("==GESTIONAR HISTORIAL==");
                            gestionarHistorial();
                            break;
                        case 4:
                            System.out.println("==BUSCAR BICICLETAS==");
                            buscarBicicletas();
                            break;
                        default:
                            System.out.println("saliendo...");
                            exit = true;

                    }
                }
            }
        } else {
            System.out.println("Nombre de usuario o la contraseña son incorrectos.");
        }
    }


    //GESTIONAR CUENTA (MENU INICIAR SESION)
    public void gestionarCuenta() {
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("Elige una opción \n");
            System.out.println("1. Cuenta");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Gestionar Historial");
            System.out.println("4. Buscar bicicletas");
            System.out.println("5. salir");
            opcion = read.nextInt();
            read.nextLine();
            if (opcion < 1 || opcion > 5) {
                System.out.println("Introduce la opcion correcta");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("==CUENTA==");
                         /*Muestra toda la información de la cuenta: nombre de
                         usuario, nombre, apellidos, DNI, correo electrónico…*/
                        mostrarInformacionUsuario();
                        break;
                    case 2:
                        System.out.println("==CAMBIAR CONTRASEÑA==");
                        /*Al usuario le saldrá una ventana donde tendrá que poner la contraseña anterior, el correo electrónico y la nueva contraseña.*/
                        cambiarContrasenya();
                        break;
                    case 3:
                        System.out.println("==ELIMINAR CUENTA==");
                        eliminarCuenta();
                        break;
                    case 4:
                        System.out.println("==CAMBIAR NOMBRE USUARIO==");
                        cambiarNombreUsuario();
                        break;
                    default:
                        System.out.println("Saliendo...");
                        exit = true;
                }
            }
        }
    }

    //MOSTRAR INFORMACION DE USUARIO
    public void mostrarInformacionUsuario() {

        if (usuarioActual != null) {
            System.out.println("=== Información del Usuario ===");
            System.out.println("Nombre: " + usuarioActual.getNombre());
            System.out.println("Apellido: " + usuarioActual.getApellidos());
            System.out.println("Nombre de usuario: " + usuarioActual.getNombreUsuario());
            System.out.println("DNI: " + usuarioActual.getDni());
            System.out.println("Correo electrónico: " + usuarioActual.getEmail());
            System.out.println("Código Postal: " + usuarioActual.getCp());
            System.out.println("Contraseña: " + usuarioActual.getContrasenya());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }


    //CAMBIAR CONTRASEÑA
    public void cambiarContrasenya() {

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce tu nombre de usuario:");
        String nombreUsuario = read.nextLine();
        System.out.print("Introduce contraseña actual: ");
        String actual = read.nextLine();
        System.out.print("Nueva contraseña: ");
        String nueva = read.nextLine();

        UsuarioService service = new UsuarioService();
        boolean cambiada = service.cambiarcontrasenya(nombreUsuario, actual, nueva);
        if (cambiada) {
            System.out.println("Contraseña cambiada correctamente");
        } else {
            System.out.println("La contraseña no se ha podido cambiar \n Usuario o contraseña actual incorrectos");
        }
    }

    //CAMBIAR NOMBRE DE USUARIO
    public void cambiarNombreUsuario() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce tu nombre actual de usuario");
        String nombreUsuario = read.nextLine();
        System.out.println("Introduce tu nuevo nombre de usuario");
        String nuevoNombreUsuario = read.nextLine();
        System.out.println("Introduce tu email");
        String email = read.nextLine();

        UsuarioService service = new UsuarioService();
        boolean cambiado = service.cambiarNombreUsuario(nombreUsuario, nuevoNombreUsuario, email);
        if (cambiado) {
            System.out.println("Nombre de Usuario cambiado correctamente");
        } else {
            System.out.println("El Nombre de Usuario no se ha podido cambiar \n Nombre de Usuarioactual o email incorrectos");
        }
    }

    //ELIMINAR CUENTA
    public void eliminarCuenta() {
        Scanner read = new Scanner(System.in);
        System.out.println("Estas seguro de que quieres eliminar la cuenta?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int opcion = read.nextInt();
        read.nextLine();
        UsuarioService service = new UsuarioService();
        boolean eliminarCuenta = service.eliminarCuenta(usuarioActual.getNombreUsuario());
        if (eliminarCuenta) {
            System.out.println("Cuenta eliminada");
            usuarioActual = null;
        } else {
            System.out.println("Eliminacion cancelada");
        }
    }

    //REPORTAR PROBLEMAS
    public void reportarProblemas(){
        Scanner read = new Scanner(System.in);
        int opcion=0;
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        System.out.println(Constantes.PROBLEMAS);
        opcion=read.nextInt();
        read.nextLine();

        if (opcion==uno){
            uno++;
            System.out.println(opcion + " " + uno);
        } else if (opcion ==dos) {
            System.out.println(opcion + " " + dos);
            dos++;
        } else if (opcion == tres) {
            tres++;
            System.out.println(opcion + " " + tres);
        } else {
            cuatro++;
            System.out.println(opcion + " " + cuatro);
        }
        //SI
         /*Al tener varias opciones y querer cuantas veces se ha ejeutado cada opcion, tengo que hacer un array list?
         y si es que si, tengo que hacer una nueva clase en dao que sea 'Reportar problemas con el array list?'
         y despues otra en service para que guarde cuanto se ha ejecutado cada opcion?*/

    }

    //GESTIONAR HISTORIAL
    public void  gestionarHistorial(){
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("Elige una opción \n");
            System.out.println("1. Eliminar Historial");
            System.out.println("2. Ver Historial de Reservas");
            System.out.println("2. Ver Historial de Alquileres");
            System.out.println("3. salir");
            opcion = read.nextInt();
            read.nextLine();
            if (opcion < 1 || opcion > 5) {
                System.out.println("Introduce la opcion correcta");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("==ELIMINAR HISTORIAL==");
                        //Le saldrá una ventana de aviso al usuario indicando que si desea eliminar el historial definitivamente
                        break;
                    case 2:
                        System.out.println("==VER HISTORIAL DE RESEVAS==");
                        //El usuario podrá ver todas las reservas realizadas
                        break;
                    case 3:
                        System.out.println("==VER HISTORIAL DE ALQUILERES==");
                        //El usuario podrá ver todos los alquileres realizados
                        break;

                    default:
                        System.out.println("Saliendo...");
                        exit = true;
                }
            }
        }

    }

    //BUSCAR BICICLETAS
    public void buscarBicicletas() {
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        boolean exit = false;
        while (!exit) {
            System.out.println("Elige una opción \n");
            System.out.println("1. Alquilar Bicicleta");
            System.out.println("2. Reservar Bicicleta");
            System.out.println("3. salir");
            opcion = read.nextInt();
            read.nextLine();
            if (opcion < 1 || opcion > 5) {
                System.out.println("Introduce la opcion correcta");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("==ALQUILAR BICICLETA==");
                        //El usuario alquila una bicicleta identificada por el ID SI
                        //Al tener ID hace falta una clase en Domain con el atributo ID?
                        //tengo que hacer array list en el dao? con nueva clase para guardarlas?
                        /*menu con alquilar, anular alquiler, salir*/

                        break;
                    case 2:
                        System.out.println("==RESEVAR BICICLETA==");
                        //El usuario podrá reservar una bicicleta mediante su ID antes de su uso,
                        // esta bicicleta queda bloqueada en la estación que el usuario elija
                        /*menu con rervar, anular reserva, salir*/
                        break;
                    default:
                        System.out.println("Saliendo...");
                        exit = true;
                }
            }
        }

    }



}



