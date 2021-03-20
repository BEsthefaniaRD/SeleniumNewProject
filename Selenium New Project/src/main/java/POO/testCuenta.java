package POO;

import java.util.Scanner;

public class testCuenta {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		//encapsulamiento set y get

		String nombre;
		String numero;
		double tipo;
		double importe;

		// instancia u objeto
		// asignar valor a las variables por teclado
		Cuenta cuenta1 = new Cuenta();

		System.out.println("Ingresa nombre: ");
		nombre = sca.next();

		System.out.println("Ingresa numero de cuenta: ");
		numero = sca.next();

		System.out.println("Tipo de interes: ");
		tipo = sca.nextDouble();

		System.out.println("Saldo: ");
		importe = sca.nextDouble();

		sca.close();

		// asignar valores con nuestro metodo set

		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.settipoInteres(tipo);
		cuenta1.setsaldo(importe);
		System.out.println(cuenta1.getNombre());

		// Utilizar nuestro constrctor con parametros y asignarlos
		Cuenta cuenta2 = new Cuenta("Fani Romero", "123", 12.3, 5000);
		System.out.println(cuenta2.getNombre());

		// utilizar el constructor que recibe un objeto
		Cuenta cuenta3 = new Cuenta(cuenta1);
		System.out.println("/////////////////");
		System.out.println("Cuenta 1 saldo " + cuenta1.getsaldo());
		System.out.println("Cuenta 3 saldo " + cuenta3.getsaldo());

		// ingreso en la cuenta 1
		cuenta1.ingreso(4000);
		System.out.println("/////////////////");
		System.out.println("Cuenta 1 saldo después del ingreso " + cuenta1.getsaldo());
		System.out.println("Cuenta 3 saldo " + cuenta3.getsaldo());

		// Mostrar datos de la cuenta 3
		System.out.println("/////////////////////////Datos de la cuenta 2 /////////////////");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("El número de cuenta: " + cuenta2.getnumeroCuenta());
		System.out.println("Tipo de interes: " + cuenta2.gettipoInteres());
		System.out.println("Saldo: " + cuenta2.getsaldo());

		// Mostrar datos de la cuenta 3
		System.out.println("/////////////////////////Datos de la cuenta 3 /////////////////");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("El número de cuenta: " + cuenta3.getnumeroCuenta());
		System.out.println("Tipo de interes: " + cuenta3.gettipoInteres());
		System.out.println("Saldo: " + cuenta3.getsaldo());

		// Realizar una transferencia de 1000 d la cuenta 3 a la cuenta2
		System.out.println("\nHacer transferencia entre cuentas");
		cuenta3.transferencia(cuenta2, 2000);

		// Mostrar datos de la cuenta 3
		System.out.println("/////////////////////////Datos de la cuenta 2 /////////////////");
		System.out.println("Nombre del titular: " + cuenta2.getNombre());
		System.out.println("El número de cuenta: " + cuenta2.getnumeroCuenta());
		System.out.println("Tipo de interes: " + cuenta2.gettipoInteres());
		System.out.println("Saldo: " + cuenta2.getsaldo());

		// Mostrar datos de la cuenta 3
		System.out.println("/////////////////////////Datos de la cuenta 3 /////////////////");
		System.out.println("Nombre del titular: " + cuenta3.getNombre());
		System.out.println("El número de cuenta: " + cuenta3.getnumeroCuenta());
		System.out.println("Tipo de interes: " + cuenta3.gettipoInteres());
		System.out.println("Saldo: " + cuenta3.getsaldo());

	}

}
