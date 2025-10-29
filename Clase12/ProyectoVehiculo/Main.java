package Clase12.ProyectoVehiculo;

public class Main {
    public static void main(String[] args) {
        Motor objMotor = new Motor("12345ABC", "Toyota");
        Conductor objConductor = new Conductor("Juan Perez", 987654321);

        System.out.println(objMotor);
        System.out.println(objConductor);

        Vehiculo objVehiculo = new Vehiculo("XYZ-789", objMotor);
        System.out.println(objVehiculo);

        objVehiculo.asignarConductor(objConductor);
    }
}
