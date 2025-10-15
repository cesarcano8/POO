package Tienda;

public class OperacionesProducto {
    public static double calcularSubtotal(Producto producto) {
        if(producto.getCantidad() < 0 || producto.getPrecioUnitario() < 0) {
            System.out.println("Error: La cantidad y el precio unitario deben ser positivos.");
            return 0;
        }
        return producto.getCantidad() * producto.getPrecioUnitario();
    }

    public static double aplicarDescuento(double subtotal, double porcentajeDescuento) {
        return subtotal * (1 - porcentajeDescuento / 100);
    }

    public static int incrementarCantidad(Producto producto, int incremento) {
        if(incremento < 0) {
            System.out.println("Error: El incremento debe ser positivo.");
            return 0;
        }
        int nuevaCantidad = producto.getCantidad() + incremento;
        return nuevaCantidad;
        


    }
}
