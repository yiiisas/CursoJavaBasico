package POO;

public class SmartWatch extends SmartDevice{
    String materialCorrea;

    public SmartWatch(String pantalla, String alamcenamiento, String memoria, String sistOperativo, String materialCorrea) {
        super(pantalla, alamcenamiento, memoria, sistOperativo);
        this.materialCorrea = materialCorrea;
    }
}
