import java.util.Scanner;
public class PracticaCondicionales {
    public static void main(String[] args) {
        /*
         * Ejercicio 4.1.a
         * Si un ángulo es igual a 90 grados, imprimir el 
            mensaje "El ángulo es un ángulo recto" 
            sino imprimir el mensaje "El ángulo no es 
            un ángulo recto".

            Entrada: Angulo
            Proceso: Validar si el angulo es igual a 90 grados
            Salida: Obtener el mensaje si es o no es un angulo recto
         * 
         */

        int angulo = 80; 

        if(angulo == 90){
    //        System.out.println("El angulo es un angulo recto");
        }else{
   //         System.out.println("El angulo no es un angulo recto"+"\n");
        }

        /*
        --------------------------------------------------------------------------------------------------
        Ejercicio 4.1.b
        Si la temperatura es superior a 100 grados, visua
        lizar el mensaje “por encima del punto de ebulli
        ción del agua” sino visualizar el mensaje “por 
        debajo del punto de ebullición del agua”.

        Entrada: temperatura
        Proceso: 
        Salida: 
        */ 

        double temperatura = 30.0;
        if (temperatura < 100){
   //         System.out.println("por encima del punto de ebullición del agua");
        }else {
   //         System.out.println("por debajo del punto de ebullición del agua"+"\n");
        }

        /*
        --------------------------------------------------------------------------------------------------
        Ejercicio 4.1.c
        Si el número es positivo, sumar el número a total 
        de positivos, sino sumar al total de negativos.


        Entreda: numero
        Proceso: evaluar numero si es menor o mayor a 0
        Salida: suma de numeros positivos o negativos
         */
        int Numero = -5;

        if (Numero > 0){
  //          System.out.println(Numero + 5 + 6 + 7);
        }else{
  //          System.out.println(Numero + -2 + -5 +"\n");
        }

        /*
        --------------------------------------------------------------------------------------------------
        Ejercicio 4.1.d
        Si x es mayor que y, y z es menor que 20, leer 
        un valor para p.


        Entreda: valor de x,y,z
        Proceso: 
        Salida: suma de numeros positivos o negativos
         */

        int x = 5;
        int y = 2;
        int z = 10;
        String p = "xd";

        if (x>y || z<20){
    //        System.out.println(p +"\n");
        }
        
        /*
        --------------------------------------------------------------------------------------------------
        Ejercicio 4.1.e
        Si distancia es mayor que 20 y menos que 35, 
        leer un valor para tiempo.


        Entreda: distancia
        Proceso: evaluar el dato y determinar si esta en el rango solicitado
        Salida: impresion de t, como confirmacion de que se cumplen las condiciones
         */
        
        int distance = 15;
        int t = 30;

        if (distance > 20 || distance < 35){
    //        System.out.println(t+"\n");
        }

       /*
    --------------------------------------------------------------------------------------------------------------------------------

        4.2. Escribir un programa que solicite al usuario introducir 
            dos números. Si el primer número introducido es ma
            yor que el segundo número, el programa debe impri
            mir el mensaje El primer número es el mayor, 
            en caso contrario el programa debe imprimir el men
            saje El primer número es el más pequeño. 
            Considerar el caso de que ambos números sean igua
            les e imprimir el correspondiente  mensaje.
        */

    /*Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num1 = sc.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int num2 = sc.nextInt();

    if(num1 > num2){
        System.out.println("El primer número es mayor.");
    }else if(num2 > num1){
        System.out.println("El segundo numero es mayor.");
    }else{
        System.out.println("Ambos numeros son iguales-");
    }
 /*
    --------------------------------------------------------------------------------------------------------------------------------

        4.3. Dados tres números deducir cuál es el central.
        */
    int a = 3;
    int b = 5;
    int c = 2;

    int central;
        
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            central = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            central = b;
        } else {
            central = c;
        }
        
       // System.out.println("El número central es: " + central);
     /*
    --------------------------------------------------------------------------------------------------------------------------------

        4.4. Calcular la raíz cuadrada de un número y escribir su 
            resultado. Considerando el caso en que el número sea 
            negativo.
        */
        int num4 = -16;

        double RaizCuadrada = Math.sqrt(num4);
        
        if(num4 > 0){
            System.out.println("El resultado de la operacion es: "+ RaizCuadrada);
        }else{
            System.out.println("El numero ingresado es negativo, no es posible operarlo.");
        }
        
    }
}