package banco;

class Cliente {
    private InformacionCliente infoCliente;

    public Cliente(InformacionCliente infoCliente) {
        this.infoCliente = infoCliente;
    }

    public String getNombre() {
        return infoCliente.getNombre();
    }

    public InformacionCliente getInfoCliente() {
        return infoCliente;
    }
}

// Introduce Parámetro Objeto: Agrupa la información del cliente
class InformacionCliente {
    private String dni;
    private String nombre;
    private String direccion;

    public InformacionCliente(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
