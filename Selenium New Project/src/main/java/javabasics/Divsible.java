package javabasics;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Divsible {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int num = 0;

		// int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero por
		// favor: "));

		System.out.println("Ingresa un n�mero por favor: ");
		num = sca.nextInt();
		sca.close();

		if (num % 2 == 0) {
			System.out.println("El n�mero " + num + " es divisible entre 2");
		} else {
			System.out.println("El n�mero " + num + " no es divisible entre 2");
		}

	}

}
