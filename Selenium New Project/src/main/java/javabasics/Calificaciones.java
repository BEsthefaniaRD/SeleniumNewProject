package javabasics;

import java.util.Scanner;

public class Calificaciones {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		double cal = 0.0;

		System.out.println("Ingresa tu calificación: ");
		cal = sca.nextDouble();

		if (cal >= 9.0) {
			System.out.println("Aprobado, usted es un alumno sobresaliente.");
		} else if (cal < 9.0 && cal >= 7.0) {
			System.out.println("Aprobado, es un buen alumno.");
		} else {
			// else if(cal <= 6.0)
			System.out.println("Reprobado, usted no paso.");

		}

		sca.close();
		
	}

}
