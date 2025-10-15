package CuentasBancos;

public class OperacionesBancarias {
    
    public void depositar(CuentaBancaria cuenta, double monto) {
        if (monto > 0) {
            double nuevoSaldo = cuenta.getSaldo() + monto;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Deposito exitoso. Nuevo saldo: " + nuevoSaldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(CuentaBancaria cuenta, double monto) {
        if (monto > 0 && monto <= cuenta.getSaldo()) {
            double nuevoSaldo = cuenta.getSaldo() - monto;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Retiro exitoso. Nuevo saldo: " + nuevoSaldo);
        } else {
            System.out.println("Error: Fondos insuficientes o monto invalido.");
        }
    }
}
