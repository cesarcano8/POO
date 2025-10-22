package Clase11.Ejemplo1;

public class EjecutarHerenciaAnimal {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Gato Jun = new Gato();
        Perro Candy = new Perro();

        miAnimal.hacerSonido();
        Jun.hacerSonido();
        Candy.hacerSonido();

        

    }
}
