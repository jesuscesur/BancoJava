package banco;

public class Cuenta {
	private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    /**
     * Constructor para crear un nuevo objeto {@code Cuenta}.
     *
     * @param numeroCuenta  El número único de la cuenta.
     * @param saldoInicial El saldo inicial de la cuenta.
     * @param cliente      El cliente titular de la cuenta.
     */
    public Cuenta(int numeroCuenta, double saldoInicial, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }

    /**
     * Obtiene el número de la cuenta.
     *
     * @return El número de la cuenta.
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo El nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el cliente titular de la cuenta.
     *
     * @return El objeto {@code Cliente} titular de la cuenta.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Realiza un ingreso de dinero en la cuenta, incrementando el saldo.
     *
     * @param cantidad La cantidad de dinero a ingresar.
     */
    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    /**
     * Realiza un retiro de dinero de la cuenta, decrementando el saldo si hay fondos suficientes.
     *
     * @param cantidad La cantidad de dinero a retirar.
     * @return {@code true} si el retiro se realizó con éxito, {@code false} si no hay suficiente saldo.
     */
    public boolean retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }
}