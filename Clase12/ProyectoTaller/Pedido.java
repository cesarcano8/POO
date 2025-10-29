package Clase12.ProyectoTaller;
import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private LocalDate fecha;
    private int numeroTajetaCredito;

    public Pedido(Cliente cliente, Producto producto, LocalDate fecha, int numeroTajetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTajetaCredito = numeroTajetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public Producto getProducto() {
        return producto;
    }
    public LocalDate getFecha() {
        return fecha;   
    }
    public int getNumeroTajetaCredito() {
        return numeroTajetaCredito;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", producto=" + producto + ", fecha=" + fecha + ", numeroTajetaCredito=" + numeroTajetaCredito + "]";
    }
    
}
