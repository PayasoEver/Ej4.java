import java.lang.annotation.Repeatable;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pito= new Pintura(250);
        Rectangulo reco=new Rectangulo(20,35);
        Cilindro ciri=new Cilindro(30,10);
        Esfera bobo=new Esfera(15);
        System.out.println(pito.rellenar(reco.getArea()));
        System.out.println(pito.rellenar(ciri.getArea()));
        System.out.println(pito.rellenar(bobo.getArea()));


    }
}
