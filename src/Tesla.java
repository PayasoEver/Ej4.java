public class Tesla extends Coche {

    public Tesla(){
        super("Teslan't",0);
    }

    @Override
    public String frenar() {
        return "Tesla está cayendo sin parar";
    }
}
