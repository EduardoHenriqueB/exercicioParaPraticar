package ponto2d;
public class Ponto2D {
    private double x;
    private double y;


    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }


    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDist() {
        return Math.sqrt(x * x + y * y);
    }


    public double calcularDistanP2(Ponto2D ponto2) {
        double delX = ponto2.x - this.x;
        double delY = ponto2.y - this.y;
        return Math.sqrt(delX * delX + delY * delY);
    }


}
