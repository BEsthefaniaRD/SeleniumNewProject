package javabasics;

import java.util.Scanner;

public class SumarParEImpar {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		double par = 0, impar = 0, residuo, numeroTemp;

		//int nElementos;

		//System.out.println("�Cuantas veces se va a repetir el programa: ");
		//nElementos = sca.nextInt();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Ingrese el n�mero " + i + ":");
			numeroTemp = sca.nextDouble();

			while (numeroTemp < 0) {
				System.out.println("El n�mero debe ser mayor a cero y tu numero es: " + numeroTemp
						+ "Ingresa nuevamente el n�mero: ");
				numeroTemp = sca.nextDouble();
			}
			residuo = numeroTemp % 2;

			if (residuo == 0) {
				System.out.println("El n�mero que ingresaste es Par [" + numeroTemp + "]");
				par += numeroTemp;
			} else if (residuo != 0 && residuo > 0) {
				System.out.println("El n�mero que ingresaste es Impar [" + numeroTemp + "]");
				impar += numeroTemp;
			} else {
				System.out.println("No puedes ingresar un n�mero menor a 0");
			}

		}
		System.out.println();
		System.out.println("La suma de los n�meros Pares es: " + par + "");
		System.out.println("La suma de los n�meros Impares es:" + impar + "");

		sca.close();

	}

}
