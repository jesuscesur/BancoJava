package banco;

public class Cliente {
		private String dni;
	    private String nombre;
	    private String direccion;

	    public Cliente(String dni, String nombre, String direccion) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.direccion = direccion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

}
