package javabasics;

import java.util.Scanner;

public class SumarParEImpar {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		double par = 0, impar = 0, residuo, numeroTemp;

		//int nElementos;

		//System.out.println("¿Cuantas veces se va a repetir el programa: ");
		//nElementos = sca.nextInt();

		for (int i = 0; i <= 5; i++) {
			System.out.println("Ingrese el número " + i + ":");
			numeroTemp = sca.nextDouble();

			while (numeroTemp < 0) {
				System.out.println("El número debe ser mayor a cero y tu numero es: " + numeroTemp
						+ "Ingresa nuevamente el número: ");
				numeroTemp = sca.nextDouble();
			}
			residuo = numeroTemp % 2;

			if (residuo == 0) {
				System.out.println("El número que ingresaste es Par [" + numeroTemp + "]");
				par += numeroTemp;
			} else if (residuo != 0 && residuo > 0) {
				System.out.println("El número que ingresaste es Impar [" + numeroTemp + "]");
				impar += numeroTemp;
			} else {
				System.out.println("No puedes ingresar un número menor a 0");
			}

		}
		System.out.println();
		System.out.println("La suma de los números Pares es: " + par + "");
		System.out.println("La suma de los números Impares es:" + impar + "");

		sca.close();

	}

}
