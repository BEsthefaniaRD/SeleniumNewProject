package javabasics;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Divsible {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		int num = 0;

		// int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número por
		// favor: "));

		System.out.println("Ingresa un número por favor: ");
		num = sca.nextInt();
		sca.close();

		if (num % 2 == 0) {
			System.out.println("El número " + num + " es divisible entre 2");
		} else {
			System.out.println("El número " + num + " no es divisible entre 2");
		}

	}

}
