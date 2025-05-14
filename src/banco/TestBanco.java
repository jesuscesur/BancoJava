package banco;

public class TestBanco {

    public static void main(String[] args) {
        // Crear información del cliente (Introduce Parámetro Objeto)
        InformacionCliente antonioInfo = new InformacionCliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
        InformacionCliente beatrizInfo = new InformacionCliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

        // Crear clientes
        Cliente antonio = new Cliente(antonioInfo);
        Cliente beatriz = new Cliente(beatrizInfo);

        // Crear cuentas
        Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
        Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

        // Realizar operaciones bancarias (Mover Método y Extraer Método)
        mostrarInformacionDeCuenta(cuentaAntonio);
        mostrarInformacionDeCuenta(cuentaBeatriz);

        realizarTransferencia(cuentaBeatriz, cuentaAntonio, 50);

        mostrarInformacionDeCuenta(cuentaAntonio);
        mostrarInformacionDeCuenta(cuentaBeatriz);

        realizarIngreso(cuentaAntonio, 100);
        realizarRetiro(cuentaBeatriz, 30);

        mostrarInformacionDeCuenta(cuentaAntonio);
        mostrarInformacionDeCuenta(cuentaBeatriz);

        realizarTransferencia(cuentaAntonio, cuentaBeatriz, 50);

        mostrarInformacionDeCuenta(cuentaAntonio);
        mostrarInformacionDeCuenta(cuentaBeatriz);
    }

    // Extraer Método: Muestra la información completa de una cuenta
    private static void mostrarInformacionDeCuenta(Cuenta cuenta) {
        System.out.println("Información de la cuenta:");
        mostrarDetallesCliente(cuenta.getCliente());
        mostrarSaldo(cuenta);
    }

    // Extraer Método: Muestra los detalles del cliente
    private static void mostrarDetallesCliente(Cliente cliente) {
        System.out.println("  Cliente: " + cliente.getNombre());
        // Podríamos mostrar más detalles del cliente aquí si fuera necesario
    }

    // Extraer Método: Muestra el saldo de una cuenta
    private static void mostrarSaldo(Cuenta cuenta) {
        System.out.println("  Saldo: " + cuenta.getSaldo() + " euros.");
    }

    // Mover Método: La lógica de la transferencia ahora reside en la clase Cuenta
    private static void realizarTransferencia(Cuenta origen, Cuenta destino, double cantidad) {
        origen.transferir(destino, cantidad);
        System.out.println("Se transfirieron " + cantidad + " euros de la cuenta de " +
                           origen.getCliente().getNombre() + " a la cuenta de " +
                           destino.getCliente().getNombre() + ".");
    }

    // Mover Método: La lógica del ingreso ahora reside en la clase Cuenta
    private static void realizarIngreso(Cuenta cuenta, double cantidad) {
        cuenta.ingresar(cantidad);
        System.out.println("Se ingresaron " + cantidad + " euros en la cuenta de " + cuenta.getCliente().getNombre() + ".");
    }

    // Mover Método: La lógica del retiro ahora reside en la clase Cuenta
    private static void realizarRetiro(Cuenta cuenta, double cantidad) {
        cuenta.retirar(cantidad);
        System.out.println("Se retiraron " + cantidad + " euros de la cuenta de " + cuenta.getCliente().getNombre() + ".");
    }
}
