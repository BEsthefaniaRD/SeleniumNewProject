package javabasics;

import java.util.Scanner;

public class tablasDeMultiplicar {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int resultado = 0, numTem = 0;

		System.out.println("Tablas de Multiplicar");

		System.out.println("�Cual es la tabla que quieres Multiplicar?");
		numTem = sca.nextInt();

		while (numTem <= 0) {
			System.out
					.println("Ingresa nuevamente el n�mero, ya que ingresaste un n�mero menor a cero [" + numTem + "]");
			numTem = sca.nextInt();

		}

		for (int i = 0; i <= 10; i++) {
			resultado = i * numTem;
			System.out.println("La multiplicaci�n de " + numTem + " * " + i + " es = " + resultado);
		}

		sca.close();
	}

}
