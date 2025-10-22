package Clase11.EjercicioClase11;

public class Arroz extends Producto {
    private String marca;
    private double peso; // en kilogramos

    public Arroz(String nombre, double precio, String marca, double peso) {
        super(nombre, precio);
        this.marca = marca;
        this.peso = peso;
    }

    public void codigo(){
        ref =+ 0002;
    }

    @Override
    public String info() {
        return super.info() + " - Marca: " +" - Codigo ref: "+ ref + marca + " - Peso: " + peso + " kg";
    }


}
