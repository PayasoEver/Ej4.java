public class MainPolimorfismo {

    public static void main(String[] args) {

        Coche c=new Coche("Ferrari",200);
        System.out.println(c.acelerar());

        c=new Citroen();
        System.out.println(c.arrancar());

        c=new Renauld();
        System.out.println(c.arrancar());

        c= new Tesla();
        System.out.println(c.frenar());


    }
}
