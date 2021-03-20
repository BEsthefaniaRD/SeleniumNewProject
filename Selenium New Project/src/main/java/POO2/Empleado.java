package POO2;

public class Empleado { // Clase Padre

	private String nombre;

	// Constructor
	public Empleado() {

	}

	public Empleado(String nombre) {
		this.nombre = nombre;
		System.out.println("Constructor de empleado " + nombre);
		System.out.println("");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	@Override
	public String toString() {
		return "Empleado" + nombre;
		//return super.toString() + "Empleado";

	}
}
