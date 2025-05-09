public class Posicion {

        private int fila;
        private int columna;

        //constructor
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    public Posicion(){

    }
//getter
    public int getFila() {
        return fila;
    }


    public int getColumna() {
        return columna;
    }
//setter
    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Posicion{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
