package banco;

/**
 * La clase {@code TestBanco} contiene el método principal para probar las funcionalidades
 * de las clases {@code Cliente} y {@code Cuenta}.
 * Permite crear clientes, cuentas bancarias, realizar transferencias, ingresos,
 * retiros y consultar saldos.
 *
 * @author [Tu Nombre]
 * @version 1.0
 */

public class TestBanco {

	/**
     * Método principal que sirve como punto de entrada para la aplicación de prueba bancaria.
     * Realiza diversas operaciones bancarias para demostrar la funcionalidad de las clases
     * {@code Cliente} y {@code Cuenta}.
     *
     * @param args Argumentos de línea de comandos (no utilizados en esta aplicación).
     */
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

    /**
     * Muestra el saldo actual de una cuenta bancaria en la consola.
     *
     * @param cuenta La cuenta de la que se desea mostrar el saldo.
     */
    private static void mostrarSaldo(Cuenta cuenta) {
        System.out.println("La cuenta de " + cuenta.getCliente().getNombre() + " tiene " + cuenta.getSaldo() + " euros.");
    }

    /**
     * Realiza una transferencia de dinero desde una cuenta de origen a una cuenta de destino.
     * Si la cuenta de origen tiene suficiente saldo, la cantidad se retira de la cuenta de origen
     * y se ingresa en la cuenta de destino.
     *
     * @param cuentaOrigen  La cuenta desde la cual se va a transferir el dinero.
     * @param cuentaDestino La cuenta a la cual se va a transferir el dinero.
     * @param cantidad      La cantidad de dinero a transferir.
     */
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

    /**
     * Realiza un ingreso de dinero en una cuenta bancaria.
     *
     * @param cuenta   La cuenta en la que se va a realizar el ingreso.
     * @param cantidad La cantidad de dinero a ingresar.
     */
    private static void realizarIngreso(Cuenta cuenta, double cantidad) {
        cuenta.ingresar(cantidad);
        System.out.println(cuenta.getCliente().getNombre() + " ha ingresado " + cantidad + " euros.");
    }

    /**
     * Realiza un retiro de dinero de una cuenta bancaria.
     *
     * @param cuenta   La cuenta de la que se va a retirar el dinero.
     * @param cantidad La cantidad de dinero a retirar.
     */
    private static void realizarRetiro(Cuenta cuenta, double cantidad) {
        if (cuenta.retirar(cantidad)) {
            System.out.println(cuenta.getCliente().getNombre() + " ha retirado " + cantidad + " euros.");
        } else {
            System.out.println("No hay suficiente saldo en la cuenta de " + cuenta.getCliente().getNombre() +
                               " para realizar el retiro.");
        }
    }
}

/**
 * La clase {@code Cliente} representa a un cliente del banco, con información
 * como su DNI, nombre y dirección.
 *
 * @author [Tu Nombre]
 * @version 1.0
 */