import java.util.Scanner;
public class Ejercicio47 {
    /*
     * Se desea realizar una estadística de los pesos de los 
        alumnos de un colegio de acuerdo a la siguiente tabla:
        Alumnos de menos de 40 kg.
        Alumnos entre 40 y 50 kg.
        Alumnos de más de 50 kg y menos de 60 kg.
        Alumnos de más o igual a 60 kg
     */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contadores para cada categoría
        int menos40 = 0, entre40y50 = 0, entre50y60 = 0, mas60 = 0;

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = sc.nextInt();

        // Leer pesos
        for (int i = 1; i <= n; i++) {
            System.out.print("Peso del alumno " + i + ": ");
            double peso = sc.nextDouble();

            if (peso < 40) {
                menos40++;
            } else if (peso >= 40 && peso <= 50) {
                entre40y50++;
            } else if (peso > 50 && peso < 60) {
                entre50y60++;
            } else { // peso >= 60
                mas60++;
            }
        }

        // Resultados
        System.out.println("\n--- Estadística de Pesos ---");
        System.out.println("Alumnos de menos de 40 kg: " + menos40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos de más de 50 kg y menos de 60 kg: " + entre50y60);
        System.out.println("Alumnos de más o igual a 60 kg: " + mas60);
    }


}
