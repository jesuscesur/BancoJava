package banco;

class Cuenta {
	
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Cuenta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void transferir(Cuenta destino, double cantidad) {
        if (this.retirar(cantidad)) {
            destino.ingresar(cantidad);
        } else {
            System.out.println("Saldo insuficiente en la cuenta de " + this.cliente.getNombre() + " para la transferencia.");
        }
    }
}
