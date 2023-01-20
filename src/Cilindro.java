public class Cilindro extends Forma{
    private  double altura;
    private double radio;

    public Cilindro(double altura, double radio){
        super("Cilindro");
        this.altura=altura;
        this.radio=radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return Math.PI*radio*radio*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                '}';
    }
}
