package Clase11.EjercicioClase11;

public class Carne extends Producto {
    private String tipo;
    private double peso; 

    public Carne(String nombre, double precio, String tipo, double peso) {
        super(nombre, precio);
        this.tipo = tipo;
        this.peso = peso;
    }

    public void codigo(){
        ref =+ 0003;
    }

    @Override
    public String info() {
        return super.info() + " - Tipo: " + tipo  + " - Codigo ref" + ref + " - Peso: " + peso + " kg";
    }

}

