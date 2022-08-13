package POO;

public class Main {
    public static void main(String[] args) {
        SmartPhone galaxy = new SmartPhone("6.5\"", "120gb", "12gb", "Android", "25px");
        SmartWatch appleWatch = new SmartWatch("1.5\"", "32gb", "2gb", "IOS", "cuero");

        System.out.println("Galaxy");
        System.out.println(galaxy.pantalla);
        System.out.println(galaxy.alamcenamiento);
        System.out.println(galaxy.memoria);
        System.out.println(galaxy.sistOperativo);
        System.out.println(galaxy.camara);

        System.out.println("Apple Watch");
        System.out.println(appleWatch.pantalla);
        System.out.println(appleWatch.alamcenamiento);
        System.out.println(appleWatch.memoria);
        System.out.println(appleWatch.sistOperativo);
        System.out.println(appleWatch.materialCorrea);
    }
}
