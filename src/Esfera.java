public class Esfera extends Forma {

    private double radio;

    public Esfera( double radio){
        super("Esfera");
        this.radio=radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*radio*radio;
    }
}
