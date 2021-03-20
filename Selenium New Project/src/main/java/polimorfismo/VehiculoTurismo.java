package polimorfismo;

public class VehiculoTurismo extends Vehiculo {

	private int numeroPuertas;

	/**
	 * @author Esthefania Romero
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param numero    de puertas
	 */
	public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numeroPuertas = numeroPuertas;

	}

	/**
	 * @return the numeroPuertas
	 */
	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	@Override
	public String mostrarDatos() {
		return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNumero de Puertas: "
				+ numeroPuertas;

	}

}
