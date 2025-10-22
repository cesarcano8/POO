package Clase11.EjercicioClase11;

public class Producto {
    protected String nombre;
    protected double precio;
    protected int ref;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.ref = 0000;
    }

    public void codigo(){
        ref =+ 0001;
    }

    public String info() {
        return "Producto: " + nombre + " - Codigo ref: "+ ref + " - Precio: $" + precio;
    }
}
