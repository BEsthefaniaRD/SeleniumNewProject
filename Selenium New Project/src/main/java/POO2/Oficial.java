package POO2;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
		System.out.println("Constructor del Oficial");
		System.out.println("");
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
}
