package Clase11.Ejemplo2;

public class Vehiculo {
    protected String marca;
    protected int velocidad;    
    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public String info() {
        return "Vehículo " + marca + " - Velocidad: " + velocidad + " km/h";
    }
}
