package javabasics;

import java.util.Scanner;

public class ArregloStrings {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);

		int nElementos;
		
		System.out.println("Dame el tamaño del arreglo: ");
		nElementos = sca.nextInt();
		
		String [] arr = new String[nElementos];
		
		for ( int i = 0; i < nElementos; i++ ) 
		
		{
			
			System.out.println("Digite una palabra en el indice " + i + ":");
			String palabra = sca.next();
			arr[i] = palabra;
						
		}

		for ( int i = 0; i < nElementos; i++ ) 
		
		{
			
			System.out.println("La palabra es: '" + arr[i] + "' y esta en el indice [" + i + "]");
			
		}
		
		sca.close();
		
			}
}