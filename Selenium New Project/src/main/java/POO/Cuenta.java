package POO;

public class Cuenta {

	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * **/

	// Los constructores sirven para crear instancias desde otras clases
	// Constructor cuenta
	public Cuenta() {
	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param String String double double
	 */

	// Constructor con muchos parametros
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param Objet
	 */

	// Creamos un objeto de tipo cuenta, c es un objeto
	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;

	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param String
	 */
	// SET asignar valor a la variable

	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param String
	 */

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param double
	 */

	public void settipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param double
	 */

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

	// Se le llama encapsulación

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return String
	 */

	public String getNombre() {
		return this.nombre;

	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return String
	 */

	public String getnumeroCuenta() {
		return this.numeroCuenta;

	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */

	public double gettipoInteres() {
		return this.tipoInteres;

	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */

	public double getsaldo() {
		return this.saldo;

	}

	// this atributos, variables a nivel de clase

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */

	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;

		if (n < 0) {
			ingresoCorrecto = false;
		} else {

			saldo = saldo + n;

		}

		return ingresoCorrecto;
	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */
	
	public boolean reintegro(double n) {
	boolean reintegroCorrecto = true;
	
	if(n<0) {
		reintegroCorrecto = false;
	}else if(saldo>=n){
		
		saldo -= n;
	}else {
		reintegroCorrecto = false;
	}
	return reintegroCorrecto;
		
		
	}

	/**
	 * @author Brenda Romero
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */

	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if (n < 0) {
			correcto = false;

		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);

		} else {

			correcto = false;
		}

		return correcto;

	}

}
