import java.util.Scanner;

public class GestionPlayas {
    private Playa[] playas;


    public GestionPlayas(Playa[] playas) {
        this.playas = playas;
    }

    //Por defecto con 10 playas
    public GestionPlayas() {
       this.playas=new Playa[10];
        for (int i = 0; i < playas.length ; i++) {
            if (i%2==0){
                playas[i]=new PayaGrande();
            }else {
                playas[i] = new Cala();
            }
        }
    }

    //Tamaño del Array introducido desde el tester
    public GestionPlayas(int tamanyo) {
        this.playas=new Playa[tamanyo];
        for (int i = 0; i < playas.length ; i++) {
            if (i%2==0){
                playas[i]=new PayaGrande();
            }else {
                playas[i] = new Cala();
            }
        }
    }


    public Playa[] getPlayas() {
        return playas;
    }

    public void setPlayas(Playa[] playas) {
        this.playas = playas;
    }

    //2
    public boolean darDeBaja(int id){
        return true;
    }
    //3
    public Playa anyadirPlaya(){
        Scanner read = new Scanner(System.in);
        Playa playa=null;

        while (playa==null){
            System.out.println(" Es playa grande o cala");
            String respuesta=read.nextLine();
        if (respuesta.equals("Grande")){
           playa=new PayaGrande();
        } else if (respuesta.equals("Cala")) {
            playa=new Cala();
        }

        }
        return playas[0];
    }
    public boolean hayHueco(){
        boolean hay=false;
        boolean salir =false;
        for (int i = 0; i < playas.length && !salir; i++) {
            if (playas[i]==null){
                hay=true;
                salir=true;
            }
        }
        return hay;
    }
    public void insertarPlaya(Playa playa){
        boolean salir= false;
        for (int i = 0; i < playas.length && !salir; i++) {
            if (playas[i]==null){
                playas[i]=playa;
                salir=true;
            }
        }
    }

    //4
    public void mostrarPorLongitud (int longitud){
        for (int i = 0; i < playas.length; i++) {
            if (playas[i].getLongitud()>longitud && playas[i]==null){
                System.out.println(playas[i].toString());
            }

        }
    }

    //5
    public void mostrarPorComunidad (String comunidad){
        for (int i = 0; i < playas.length; i++) {
            if (playas[i].getDireccion().getComunidad().equals(comunidad)){
                System.out.println(playas[i].toString());
            }

        }
    }

    //6



    //7


    //8





}

