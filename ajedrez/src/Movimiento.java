public class Movimiento {
     private Posicion posInicial;
     private Posicion posFinal;

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }
    public Movimiento(){

    }

    public Posicion getPosInicial() {
        return posInicial;
    }


    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }
    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    public boolean esVertical(){

        boolean aux= false;
        if ((posInicial.getColumna() == posFinal.getColumna()) && (posInicial.getFila()!= posFinal.getColumna())){
            aux=true;
        }
        return aux;
    }

    public boolean esHorizontal(){
        boolean aux = false;
        if ((posInicial.getColumna() == posFinal.getColumna()) && (posInicial.getFila() != posFinal.getColumna())){
            aux= true;
        }
        return aux;

    }
    public int saltoHorizontal() {
        return Math.abs(posInicial.getColumna() - posFinal.getColumna());
    }
     public int saltoVertical(){
        return Math.abs(posInicial.getFila() - posFinal.getFila());

     }

    public boolean esDiagonal(){
        boolean aux=false;
        if (saltoHorizontal() == saltoVertical()){
            aux=true;
        }
        return aux;
    }


}


