package Clase12.ProyectoVehiculo;

public class Motor {
    private String serial;
    private String fabricante;

    public Motor(String serial, String fabricante) {
        this.serial = serial;
        this.fabricante = fabricante;
    }

    public String getSerial() {
        return serial;
    }
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "serial='" + serial + '\'' +
                ", fabricante='" + fabricante + '\'' + 
                '}';
    }
}
