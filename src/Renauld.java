public class Renauld extends Coche{

    public  Renauld(){
        super("Renauld",136);
    }

    @Override
    public String arrancar() {
        return"El Renauld " + super.arrancar();
    }
}
