import java.util.Scanner;

public class Ejercicio45 {
     public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el numero a evaluar.");
    int numero = sc.nextInt();

     // Método 1: Usando módulo %
        if (numero % 2 == 0) {
            System.out.println("Método 1 (%): " + numero + " es par");
        } else {
            System.out.println("Método 1 (%): " + numero + " es impar");
        }

    // Método 2: Usando división entera
        if ((numero / 2) * 2 == numero) {
            System.out.println("Método 2 (división entera): " + numero + " es par");
        } else {
            System.out.println("Método 2 (división entera): " + numero + " es impar");
        }

    }
    
}
