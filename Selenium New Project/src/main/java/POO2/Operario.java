package POO2;

public class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
		System.out.println("Constructor del Operario");
		System.out.println("");
	}

	@Override
	public String toString() {// Hereda método toString pero lo esta sobreescribiendo
		return super.toString() + " -> Operario";
	}

}
