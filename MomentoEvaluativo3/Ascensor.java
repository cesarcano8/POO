package MomentoEvaluativo3;

import java.util.ArrayList;
import java.util.List;

public class Ascensor {
    private int pisoActual;
    private Puerta puerta;
    private List<BotonAscensor> botonesInternos;

    public Ascensor(int numPisos) {
        pisoActual = 1; // inicia en piso 1
        puerta = new Puerta();
        botonesInternos = new ArrayList<>();
        for (int i = 1; i <= numPisos; i++) {
            botonesInternos.add(new BotonAscensor(i));
        }
    }

    public int getPisoActual() { 
        return pisoActual; 
}

    public void abrirPuertaConCampana() {
        System.out.println("🔔 Campana: ascensor disponible en piso " + pisoActual);
        puerta.abrir();
    }

    public void cerrarPuerta() {
        puerta.cerrar();
    }

    public void moverA(int pisoDestino) {
        if (pisoDestino == pisoActual) {
            System.out.println("El ascensor ya está en el piso " + pisoDestino);
            return;
        }

        cerrarPuerta();
        String direccion = (pisoDestino > pisoActual) ? "subiendo" : "bajando";
        System.out.println("Ascensor " + direccion + " al piso " + pisoDestino + "...");

        if (direccion.equals("subiendo")) {
            for (int i = pisoActual + 1; i <= pisoDestino; i++) {
                System.out.println("   → Piso " + i);
            }
        } else {
            for (int i = pisoActual - 1; i >= pisoDestino; i--) {
                System.out.println("   → Piso " + i);
            }
        }

        pisoActual = pisoDestino;
        System.out.println("Ascensor ha llegado al piso " + pisoDestino + ".");
        System.out.println("💡 Luz apagada | 🔇 Sonido desactivado");
        System.out.println("🔔 Campana: llegada al piso " + pisoDestino);
        puerta.abrir();
    }

    public List<BotonAscensor> getBotonesInternos() {
        return botonesInternos;
    }
}
