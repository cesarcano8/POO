import java.util.Scanner;
public class Ejercicio48 {
    /*
     * Realizar un algoritmo que averigüe si dados dos números introducidos por teclado uno es divisor del otro

    Un número es divisor de otro cuando al dividirlo, el cociente es un número entero y el residuo es cero.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        if (a != 0 && b % a == 0) {
            System.out.println(a + " es divisor de " + b);
        } else if (b != 0 && a % b == 0) {
            System.out.println(b + " es divisor de " + a);
        } else {
            System.out.println("Ninguno es divisor del otro.");
        }
        

    }

}
