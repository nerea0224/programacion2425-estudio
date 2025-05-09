public class Punto {
    public static void main(String[] args) {


    }

    //atributos
    private double x;
    private double y;

    //constructor

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Punto(){
        this.x = 0.0;
        this.y = 0.0;

    }

    //getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //setter
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

}

