package Clase12.ProyectoVehiculo;

public class Conductor {
    private String nombre;
    private int cedula;

    public Conductor(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {  
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                '}';
    }
    
}
