package banco;

public class Cliente {
	private String dni;
    private String nombre;
    private String direccion;

    /**
     * Constructor para crear un nuevo objeto {@code Cliente}.
     *
     * @param dni       El DNI del cliente.
     * @param nombre    El nombre completo del cliente.
     * @param direccion La dirección del cliente.
     */
    public Cliente(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Obtiene el DNI del cliente.
     *
     * @return El DNI del cliente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }
}

/**
 * La clase {@code Cuenta} representa una cuenta bancaria, con un número de cuenta,
 * saldo actual y el cliente titular de la cuenta.
 *
 * @author [Jesus]
 * @version 1.0
 */