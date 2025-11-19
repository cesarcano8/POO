package MomentoEvaluativo3;

public class BotonAscensor extends Boton {
    
    private int destino;

    public BotonAscensor(int destino) {
        this.destino = destino;
    }

    @Override
    public void presionar() {
        System.out.println("Botón interno del ascensor (piso " + destino + ") presionado.");
        super.presionar();
    }

    public int getDestino() { 
        return destino; 
    }
}
