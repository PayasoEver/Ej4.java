public class Rectangulo extends Forma{

    private double longitud;
    private double ancho;

    public Rectangulo(int longitud,int ancho){
        super("Rectangulo");
        this.ancho=ancho;
        this.longitud=longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public double getAncho() {
        return ancho;
    }
    public double getLongitud() {
        return longitud;
    }

    @Override
    public double getArea() {
        return longitud*ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }
}
