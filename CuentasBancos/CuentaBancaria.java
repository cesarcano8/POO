package CuentasBancos;

public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
    setTitular(titular);
    setNumeroCuenta(numeroCuenta);
    setSaldo(saldo);
    }

    public CuentaBancaria(String titular, String numeroCuenta){
        this(titular, numeroCuenta, 0.0);
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        if(!titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Error: El nombre del titular no puede estar vacio.");
        }   
    }
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Error: el número de cuenta debe tener al menos 6 dígitos.");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }





    @Override
    public String toString(){
        return "Cuenta Bancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo
                + '}';    
    }
}

