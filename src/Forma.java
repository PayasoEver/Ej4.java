public class Forma{
    private String nombre;

    public Forma(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public double getArea() {
        return 0;
    }


}
