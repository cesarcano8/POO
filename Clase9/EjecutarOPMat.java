
package Clase9;

import java.util.Scanner;

public class EjecutarOPMat {
    public static void main(String[] args) {
        

        int opcion;
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        int base;
        int exponente;
        do{ 
            System.out.println("Menu de opciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar al cuadrado");
            System.out.println("6. Elevar al cubo");
            System.out.println("7. Elevar a la n");
            System.out.println("8. Raiz cuadrada");
            System.out.println("9. Raiz cubica");
            System.out.println("10. Raiz n");
            System.out.println("11. Salir");

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Usted ha seleccionado la opcion 1: Sumar");
                        System.out.println("Ingrese el primer numero: ");
                        a = sc.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        b = sc.nextInt(); 
                    OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);
                    System.out.println("El resultado de la suma es: " + objOp.sumar());
                    
                    break;
                case 2:
                    System.out.println("Usted ha seleccionado la opcion 2: Restar");
                    System.out.println("Ingrese el primer numero: ");
                        a = sc.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        b = sc.nextInt();
                    objOp = new OperacionesMatematicas(a,b);
                    System.out.println("El resultado de la resta es: " + objOp.restar());
                    break;
                case 3:
                    System.out.println("Usted ha seleccionado la opcion 3: Multiplicar");
                    System.out.println("Ingrese el primer numero: ");
                        a = sc.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        b = sc.nextInt();
                    objOp = new OperacionesMatematicas(a,b);
                    System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
                    break;
                case 4:
                    System.out.println("Usted ha seleccionado la opcion 4: Dividir");
                    System.out.println("Ingrese el primer numero: ");
                        a = sc.nextInt();
                        System.out.println("Ingrese el segundo numero: ");
                        b = sc.nextInt();
                    objOp = new OperacionesMatematicas(a,b);
                    System.out.println("El resultado de la division es: " + objOp.dividir());
                    break;
                case 5:
                    System.out.println("Usted ha seleccionado la opcion 5: Elevar al cuadrado");
                        System.out.println("Ingrese el numero: ");
                        base = sc.nextInt();
                    objOp = new OperacionesMatematicas(0,0);
                    System.out.println("El resultado de elevar al cuadrado es: " + objOp.elevarCuadrado(base));
                    break;
                case 6:
                    System.out.println("Usted ha seleccionado la opcion 6: Elevar al cubo");
                        System.out.println("Ingrese el numero: ");
                        base = sc.nextInt();
                    objOp = new OperacionesMatematicas(0,0);
                    System.out.println("El resultado de elevar al cubo es: " + objOp.elevarCubo(base));
                    break;
                case 7:
                    System.out.println("Usted ha seleccionado la opcion 7: Elevar a la n");
                        System.out.println("Ingrese la base: ");
                        base = sc.nextInt();
                        System.out.println("Ingrese el exponente: ");
                        exponente = sc.nextInt();
                    objOp = new OperacionesMatematicas(0,0);
                    System.out.println("El resultado de elevar a la n es: " + objOp.elevarN(base,exponente));
                    break;
                case 8:
                    System.out.println("Usted ha seleccionado la opcion 8: Raiz cuadrada");
                        System.out.println("Ingrese el numero: ");
                        base = sc.nextInt();
                    objOp = new OperacionesMatematicas(0,0);
                    System.out.println("El resultado de la raiz cuadrada es: " + objOp.calcularRaizCuadrada(base));
                    break;
                case 9:
                    System.out.println("Usted ha seleccionado la opcion 9: Raiz cubica");
                        System.out.println("Ingrese el numero: ");
                        base = sc.nextInt();
                    objOp = new OperacionesMatematicas(0,0);
                    System.out.println("El resultado de la raiz cubica es: " + objOp.calcularRaizCubica(base));
                    break;
                case 10:
                    System.out.println("Usted ha seleccionado la opcion 10: Raiz n");
                        System.out.println("Ingrese la base: ");
                        base = sc.nextInt();
                        System.out.println("Ingrese el exponente: ");
                        exponente = sc.nextInt();
                    objOp = new OperacionesMatematicas(0,0);
                    System.out.println("El resultado de la raiz n es: " + objOp.calcularRaizN(base,exponente));
                    break;
                case 11:
                    System.out.println("Usted ha seleccionado la opcion 11: Salir");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }

        }while(opcion != 11);

        sc.close();  sc.close();

        /*Tarea: Implementar los metodos 
        elevar al cuadrado
        elevar al cubo
        elevar a la n
        raiz cuadrada
        raiz cubica
        raiz n
        TODO CON PANEL DE CONTROL
        */
        
    }
}
