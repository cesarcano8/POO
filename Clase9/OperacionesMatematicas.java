package Clase9;

public class OperacionesMatematicas {
    //Atributos
    private int n1;
    private int n2;

    //Constructor

    public OperacionesMatematicas(int n1, int n2){

        this.n1= n1;
        this.n2= n2;
    }

    //Metodos
    public int sumar(){
        return n1 + n2;
    }

    public int restar(){
        return n1-n2;
    }

    public int multiplicar(){
        return n1*n2;
    }

    public double dividir(){
        double resultado;
        if(n2==0){
            resultado = 0.0;
        }else{
            return (double)n1/ (double)n2;
        }
        return resultado;
    }

    public double elevarCuadrado(int base){
        return Math.pow(base,2);
    }

    public double elevarCubo(int base){
        return Math.pow(base,3);
    }

    public double elevarN(int base, int exponente){
        return Math.pow(base,exponente);
    }

    public double calcularRaizCuadrada(int base){
        return Math.sqrt(base);
    }

    public double calcularRaizCubica(int base){
        return Math.cbrt(base);
    }

    public double calcularRaizN(int base, int exponente){
        return Math.pow(base, 1.0/exponente);
    }

    

}
