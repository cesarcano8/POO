package Clase12.ProyectoVehiculo;

public class Vehiculo {
    private String placa;
    private Motor motor;

    public Vehiculo(String placa, Motor motor) {
        this.placa = placa;
        this.motor = motor;
    }

    public void asignarConductor(Conductor conductor) {
        System.out.println("El conductor: "+ conductor + " fue asignado");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", motor=" + motor +
                '}';
    }
}
