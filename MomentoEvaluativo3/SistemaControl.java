package MomentoEvaluativo3;

import java.util.ArrayList;
import java.util.List;

public class SistemaControl {
    private Ascensor ascensor;
    private List<Piso> pisos;

    public SistemaControl(int numPisos) {
        pisos = new ArrayList<>();
        for (int i = 1; i <= numPisos; i++) {
            pisos.add(new Piso(i));
        }
        ascensor = new Ascensor(numPisos);
    }

    public void ejecutarSimulacion() {
        System.out.println("=== SIMULACIÓN DEL SISTEMA DE ASCENSOR ===\n");

        // Piso 1: presiona SUBIR
        Piso piso1 = pisos.get(0);
        System.out.println("[Usuario en piso 1 presiona botón SUBIR]");
        piso1.getBotonSubir().presionar();

        // El ascensor llega (ya está en el 1)
        System.out.println("\n[Ascensor moviéndose al piso 1...]");
        ascensor.abrirPuertaConCampana();
        piso1.getBotonSubir().desactivarIndicadores();

        // Usuario selecciona piso 3
        int destino = 3;
        System.out.println("\n[Usuario ingresa y selecciona piso " + destino + "]");
        ascensor.getBotonesInternos().get(destino - 1).presionar();

        // Mover al piso 3
        ascensor.moverA(destino);

        System.out.println("\n--- Fin del recorrido ---");
    }
}
