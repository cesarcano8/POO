package MomentoEvaluativo3;

public class Boton {
    
    protected boolean iluminado;
    protected boolean sonido;
    protected boolean activo;

    public void presionar() {
        activarIndicadores();
        activo = true;
        System.out.println("Botón presionado: indicadores visuales y sonoros activados.");
    }

    // 🔆 Activa los indicadores visuales y sonoros
    public void activarIndicadores() {
        iluminado = true;
        sonido = true;
        System.out.println("💡 Luz encendida | 🔊 Sonido emitido");
    }

    // ⚪ Desactiva los indicadores visuales y sonoros
    public void desactivarIndicadores() {
        iluminado = false;
        sonido = false;
        activo = false;
        System.out.println("💡 Luz apagada | 🔇 Sonido desactivado");
    }

    public boolean estaActivo() { 
        return activo; 
    }
}
