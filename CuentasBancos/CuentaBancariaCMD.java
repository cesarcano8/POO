package CuentasBancos;



public class CuentaBancariaCMD {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Cesar Cano", "123456", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("Danna Leon", "543211", 500.0);

        OperacionesBancarias operaciones = new OperacionesBancarias();

        operaciones.depositar(cuenta1, 200.0);
        operaciones.retirar(cuenta2, -100.0);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
