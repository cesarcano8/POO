package Clase10;

public class Biblioteca {
    public static void main(String[] args) {
        System.out.println("---Anadiendo ’Cien Anos de Soledad’---");
        Libro libro1 = new Libro("Cien Anos de Soledad", "Gabriel Garcia Marquez", 1967, 496);


        System.out.println("Datos iniciales: " + libro1);
        System.out.println("Autor: " + libro1.getAutor());


        libro1.setAnioPublicacion(1970);
        libro1.prestar();

        System.out.println("Estado final: " + libro1);
    }
    
}
