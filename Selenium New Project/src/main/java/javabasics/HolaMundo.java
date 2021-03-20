package javabasics;

public class HolaMundo {// open class

	String miNombre = "Esthefania";
	int edad = 21;
	float edadConDecimal = (float) 21.0;
	double edadDoble = 32.000;
	char letra = 'E';
	boolean bandera = true;

	public static void main(String[] args) {

		// String miNombre= "Fani";

		// System.out.print("Hola Mundo");

		double numero1 = 500.00;
		double numero2 = 35.37;
		double resultado = numero1 + numero2;

		System.out.println("El resultado es: " + resultado);
		System.out.println("El resultado de la suma es: " + (numero1 + numero2));
		System.out.println("El resultado de la multiplicacón es: " + (numero1 * numero2));
		System.out.println("El resultado de la división es:: " + (numero1 / numero2));
		System.out.println("El resultado de la resta es: " + (numero1 - numero2));
		System.out.println("El resultado del residuo es: " + (numero1 % numero2));
		
	}

}// end class
