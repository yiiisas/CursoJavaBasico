package POO;

public class SmartPhone extends SmartDevice{
    String camara;


    public SmartPhone(String pantalla, String alamcenamiento, String memoria, String sistOperativo, String camara) {
        super(pantalla, alamcenamiento, memoria, sistOperativo);
        this.camara = camara;
    }
}
