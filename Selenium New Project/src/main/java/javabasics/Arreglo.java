package javabasics;

import javax.swing.JOptionPane;

public class Arreglo {

	public static void main(String[] args) {
		
		int numeros [] = new int [5];
		
		rellenarListaDeNumeros(numeros);
		mostrarArreglo(numeros);
		
	}
	
	public static void rellenarListaDeNumeros(int arreglo[]) {
		for( int i =0; i<arreglo.length; i++) {
			String texto = JOptionPane.showInputDialog("Ingresa un número");
			arreglo[i] = Integer.parseInt(texto);
			
		}
			
	}
	
	public static void mostrarArreglo(int arreglo[]) {
		for(int i = 0; i<arreglo.length; i++) {
			System.out.println("En el indice ["+ i + "] esta el valor de: " + arreglo[i]);
	
			
			
		}
		
		
	}

}
