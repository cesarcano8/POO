package Clase11.Ejemplo2;

public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    @Override
    public void acelerar() {
        velocidad += 15;
    }

    @Override
    public String info() {
        return "Auto " + marca + " - Puertas: " + puertas + " - Velocidad: " + velocidad + " km/h";
    }
}
