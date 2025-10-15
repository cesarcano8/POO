package Tienda;

public class ProductoCMD {
    public static void main(String[] args) {

        //PRODUCTO 1

        Producto producto = new Producto("123", "Leche Alpina x 1100", -1    , -6000.0);
        Producto producto2 = new Producto("124", "Leche Colanta x 1000", 1    , 5000.0);

        System.out.println(producto);
        System.out.println(producto2);

        double subtotal = OperacionesProducto.calcularSubtotal(producto);
        System.out.println("Subtotal producto 1: " + subtotal);

        double subtotalConDescuento = OperacionesProducto.aplicarDescuento(subtotal, 50);
        System.out.println("Subtotal con descuento producto 1: " + subtotalConDescuento);

        int nuevaCantidad = OperacionesProducto.incrementarCantidad(producto, -3);
        System.out.println("Nueva cantidad producto 1: " + nuevaCantidad);

        //PRODUCTO 2

        double subtotal2 = OperacionesProducto.calcularSubtotal(producto2);
        System.out.println("Subtotal producto 2: " + subtotal2);

        double subtotalConDescuento2 = OperacionesProducto.aplicarDescuento(subtotal2, 10);
        System.out.println("Subtotal con descuento producto 2: " + subtotalConDescuento2);

        int nuevaCantidad2 = OperacionesProducto.incrementarCantidad(producto2, 3);
        System.out.println("Nueva cantidad producto 2: " + nuevaCantidad2);
        
    }
    
}
