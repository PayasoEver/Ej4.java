public class Coche {
    private String modelo;
    private boolean motor=true;
    private int ruedas=4;
    private int cilindros;

    public Coche(String modelo, int cilindros){
        this.cilindros=cilindros;
        this.modelo=modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setMotor(boolean motor) {
        this.motor = motor;
    }
    public boolean isMotor() {
        return motor;
    }
    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    public int getCilindros() {
        return cilindros;
    }

    public String arrancar(){
        if(!motor){
            return"No arranca";
        }else{
            return"Arranca";
        }
    }
    public String acelerar(){

        return"Está acelerando";
    }
    public String frenar(){

       return"Ha frenado";
    }
}
