package banco;

public class TestBanco {

	public static void main(String[] args) {
		// Crear clientes
        Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
        Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

        // Crear cuentas
        Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
        Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

        // Operaciones bancarias
        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);

        transferirDinero(cuentaBeatriz, cuentaAntonio, 50);
        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);

        realizarIngreso(cuentaAntonio, 100);
        realizarRetiro(cuentaBeatriz, 30);
        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);

        transferirDinero(cuentaAntonio, cuentaBeatriz, 50);
        mostrarSaldo(cuentaAntonio);
        mostrarSaldo(cuentaBeatriz);
    }

    // Patrón de refactorización: Extraer método
    private static void mostrarSaldo(Cuenta cuenta) {
        System.out.println("La cuenta de " + cuenta.getCliente().getNombre() + " tiene " + cuenta.getSaldo() + " euros.");
    }

    // Patrón de refactorización: Mover método (lógicamente pertenece a la clase Cuenta)
    private static void transferirDinero(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        if (cuentaOrigen.retirar(cantidad)) {
            cuentaDestino.ingresar(cantidad);
            System.out.println("Se han transferido " + cantidad + " euros de " +
                               cuentaOrigen.getCliente().getNombre() + " a " +
                               cuentaDestino.getCliente().getNombre() + ".");
        } else {
            System.out.println("No hay suficiente saldo en la cuenta de " + cuentaOrigen.getCliente().getNombre() +
                               " para realizar la transferencia.");
        }
    }

    // Patrón de refactorización: Introducir parámetro objeto (podríamos crear una clase OperacionBancaria)
    private static void realizarIngreso(Cuenta cuenta, double cantidad) {
        cuenta.ingresar(cantidad);
        System.out.println(cuenta.getCliente().getNombre() + " ha ingresado " + cantidad + " euros.");
    }

    private static void realizarRetiro(Cuenta cuenta, double cantidad) {
        if (cuenta.retirar(cantidad)) {
            System.out.println(cuenta.getCliente().getNombre() + " ha retirado " + cantidad + " euros.");
        } else {
            System.out.println("No hay suficiente saldo en la cuenta de " + cuenta.getCliente().getNombre() +
                               " para realizar el retiro.");
        }
    }
}