package javabasics;

import javax.swing.JOptionPane;

public class AreaCirculo {
	
	public static void main (String [] args) {
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
		double area = Math.PI*Math.pow(radio, 2);
				
				System.out.println("El área del circuloes: " + area);
		
	}

}
