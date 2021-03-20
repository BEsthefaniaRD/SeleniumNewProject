package javabasics;

import java.util.Scanner;

public class tablasDeMultiplicar {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int resultado = 0, numTem = 0;

		System.out.println("Tablas de Multiplicar");

		System.out.println("¿Cual es la tabla que quieres Multiplicar?");
		numTem = sca.nextInt();

		while (numTem <= 0) {
			System.out
					.println("Ingresa nuevamente el número, ya que ingresaste un número menor a cero [" + numTem + "]");
			numTem = sca.nextInt();

		}

		for (int i = 0; i <= 10; i++) {
			resultado = i * numTem;
			System.out.println("La multiplicación de " + numTem + " * " + i + " es = " + resultado);
		}

		sca.close();
	}

}
