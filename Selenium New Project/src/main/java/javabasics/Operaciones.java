package javabasics;

import javax.swing.JOptionPane;

public class Operaciones {
	
	
	public static void main (String [] args) {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer n�mero por favor"));	
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo n�mero por favor"));
		
		System.out.println("El resultado de la suma es: " + (num1 + num2));
		JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (num1 + num2));
		System.out.println("El resultado de la resta es: " + (num1 - num2));
		JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (num1 - num2));
		System.out.println("El resultado de la multiplicaci�n es: " + (num1 * num2));
		JOptionPane.showMessageDialog(null, "El resultado de la multiplicaci�n es: " + (num1 * num2));
		System.out.println("El resultado de la divisi�n es: " + (num1 / num2));
		JOptionPane.showMessageDialog(null, "El resultado de la divisi�n es: " + (num1 / num2));
		
	}

}
