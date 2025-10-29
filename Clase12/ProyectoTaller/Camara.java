package Clase12.ProyectoTaller;

public class Camara extends Producto {
    private String modelo;
    private String marca;

    public Camara(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Cámara [modelo=" + modelo + ", marca=" + marca + "]";
    }
}
