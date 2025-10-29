package Clase12.ProyectoTaller;

public class Impresion extends Producto {
    private String color;
    private Foto foto;

    public Impresion(String color, Foto foto) {
        this.color = color;
        this.foto = foto;
    }   

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Impresion [color=" + color + ", foto=" + foto + "]";
    }
}
