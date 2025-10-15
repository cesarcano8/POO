import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        /*
         * Diseñar un programa en el que a partir de una fecha 
            introducida por teclado con el formato DIA, MES, 
            AÑO se obtenga la fecha del día siguiente
         */
        Scanner sc = new Scanner(System.in);

         // Entrada
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        // Días máximos por mes
        int diasMes = 0;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasMes = 29; // Bisiesto
                } else {
                    diasMes = 28;
                }
                break;
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        diasMes = 31;
        break;
        }

        // Calcular siguiente día
        dia++;
        if (dia > diasMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        // Salida
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + anio);
    }
}