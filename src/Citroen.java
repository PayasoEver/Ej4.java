public class Citroen extends Coche{

    public Citroen(){
        super("Citroen",95);
    }

    @Override
    public String arrancar() {
        return"El Citroen "+ super.arrancar();
    }
}
