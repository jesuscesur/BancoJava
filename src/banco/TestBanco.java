package banco;

public class TestBanco {

	public static void main(String[] args) {
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
        Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

        Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
        Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);

        cuentaBeatriz.transferir(cuentaAntonio, 50);

        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);

        cuentaAntonio.ingresar(100);
        cuentaBeatriz.retirar(30);

        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);

        cuentaAntonio.transferir(cuentaBeatriz, 50);

        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);
    }

    
    private static void mostrarSaldo(Cuenta cuenta) {
        System.out.println("La cuenta de " + cuenta.getCliente().getNombre() + " tiene " + cuenta.getSaldo() + " euros.");

	}

}
