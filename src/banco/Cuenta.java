package banco;

public class Cuenta {
	private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(int numeroCuenta, double saldoInicial, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }
}