package MomentoEvaluativo3;

public class BotonPiso extends Boton{
    
    private int piso;
    private String direccion; // "subir" o "bajar"

    public BotonPiso(int piso, String direccion) {
        this.piso = piso;
        this.direccion = direccion;
    }

    @Override
    public void presionar() {
        System.out.println("Botón de piso " + piso + " (" + direccion + ") presionado.");
        super.presionar();
    }

    public int getPiso() { 
        return piso; 
    }
    public String getDireccion() { 
        return direccion; 
    }
}
