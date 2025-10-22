package Clase11.Ejemplo2;

public class Demo {
    public static void main(String[] args) {

        Auto miAuto = new Auto("Toyota", 4);
        Moto miMoto = new Moto("Honda");


        miAuto.acelerar();
        miMoto.acelerar();

        System.out.println(miAuto.info());
        System.out.println(miMoto.info());
    }
}
