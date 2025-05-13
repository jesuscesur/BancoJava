package banco;

public class Cuenta {
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

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public void transferir(Cuenta destino, double cantidad) {
        this.retirar(cantidad);
        destino.ingresar(cantidad);
    }
	
	

}
