package POO2;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("Constructor del T�cnico");
		System.out.println("");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " -> T�cnico";
	}
}
