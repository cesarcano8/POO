package Clase11.EjercicioClase11;

public class ProductoCMD {
    public static void main(String[] args) {
        Carne carne = new Carne("Carne de Res", 35500, "Res", 1.0);
        Arroz arroz = new Arroz("Arroz Diana", 2400, "Integral", 0.5);

        carne.codigo();
        arroz.codigo();

        System.out.println(carne.info());
        System.out.println(arroz.info());


    }
}
