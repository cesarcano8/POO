package MomentoEvaluativo3;

public class Piso {
    private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero) {
        this.numero = numero;
        botonSubir = new BotonPiso(numero, "subir");
        botonBajar = new BotonPiso(numero, "bajar");
    }

    public int getNumero() { 
        return numero; 
    }
    public BotonPiso getBotonSubir() { 
        return botonSubir; 
    }
    public BotonPiso getBotonBajar() { 
        return botonBajar; 
    }
}

