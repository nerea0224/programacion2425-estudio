public class Mono {
    /*Para cualquier clase hay que hacer los tributos (encapsularlos y hacerlos privados), getter, setter y toString*/



    //Atributos o caracteristicas
    private String nombre;
    private int edad;
    private float peso;
    private boolean hembra;
    private String tipo;
    private float kilosComidaSemanal;
    private String cuidador;


    //Constructores (se pone siembre 'this' y despues el atributo.)

    //Aqui lo hacemos con el nombre que le hemos dado en el main 'mono1,mono2...')
    public Mono(String nombre, int edad, float peso, boolean hembra, String tipo, float kilosComidaSemanal, String cuidador){

        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.hembra=hembra;
        this.tipo=tipo;
        this.kilosComidaSemanal=kilosComidaSemanal;
        this.cuidador=cuidador;

    }

    //aqui le metemos nosotros los valores creando el momno
    public Mono(){
        this.nombre="miMonoPreferido";
        this.edad=(int)(Math.random()*100);//aqui le decimos que queremos un random int, que este netre 0 y 100
        this.peso=15;
        this.hembra=true;
        this.tipo="Gorila";
        this.kilosComidaSemanal=30;
        this.cuidador= Cuidadores.cuidador[(int)(Math.random()*Cuidadores.cuidador.length)];
        //aqui le decimos, vete al array cuidador y me coges una posicion random y me das el nombre de la posicion, por eso se castea a int



    }

    //Getter (nos permite hacer consultas. "quiero saber la edad y el nombre de 'X' mono" informacion ya asignada)
    public String getNombre(){
        return nombre;

    }
    public int getEdad(){
        return edad;

    }
    public float getPeso(){
        return peso;

    }
    public boolean isHembra(){
        return hembra;

    }
    public String getTipo(){
        return tipo;

    }
    public float getkilosComidaSemanal(){
        return kilosComidaSemanal;


    }
    public String getCuidador(){
        return cuidador;

    }

    //Setter (para modificar los atributos) podemos cambiarle nombre,peso,edad...

    public void setNombre (String nombre){this.nombre=nombre;}
    public void setEdad (int edad){this.edad=edad;}
    public void setPeso (float peso){this.peso=peso;}
    public void setHembra (boolean hembra){this.hembra=hembra;}
    public void setTipo (String tipo){this.tipo=tipo;}
    public void setKilosComidaSemanal (float kilosComidaSemanal){this.kilosComidaSemanal=kilosComidaSemanal;}
    public void setCuidador (String cuidador){this.cuidador=cuidador;}




    //toString (toda la información del mono)

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("nombre: ").append(nombre).append("\n");
        sb.append("edad: ").append(edad).append("\n");
        sb.append("peso: ").append(peso).append("\n");
        sb.append("hembra: ").append(hembra).append("\n");
        sb.append("tipo: ").append(tipo).append("\n");
        sb.append("kilosComidaSemanal: ").append(kilosComidaSemanal).append("\n");
        sb.append("cuidador: ").append(cuidador).append("\n");
        sb.append("\n");


        return sb.toString();
    }
}
