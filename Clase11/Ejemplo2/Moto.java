package Clase11.Ejemplo2;

public class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 20;
    }

    @Override
    public String info() {
        return "Auto " + marca + " - Velocidad: " + velocidad + " km/h";
    }
}
