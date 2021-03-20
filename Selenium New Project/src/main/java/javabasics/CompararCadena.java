package javabasics;

import java.util.Scanner;

public class CompararCadena {

	public static void main(String[] args) {

		Scanner sca = new Scanner (System.in);	
		
		
		System.out.println("Escribe la primera palabra");
		String palabra1 = sca.next();
		//palabra 1 = sca.next();
		
		System.out.println("Escribe la primera palabra");
		String palabra2 = sca.next();
		//palabra 1 = sca.next();
		sca.close();
		
		System.out.println("");
		System.out.println("Compara las cadenas de texto");
		if(palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
			
		} else {
			System.out.println("Las palabras no son iguales");
			
		}
		
		System.out.println("");
		System.out.println("Compara la palabra entre Mayusculas y Minusculas");
		
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales");
			
		} else {
			System.out.println("Las palabras no son iguales");
			
		}
		
		System.out.println("");
		System.out.println("Realiza cambios en el texto");
		
		//String texto = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		
		String texto = "Hola Fani123";
		
		//Busca algo y hace un cambio en este ejemplo quita el espacio y junta todo
		String textoSinEspacios = texto.replace(" ", "");
		String textoSinNumeros = texto.replaceAll("\\d", "");
		System.out.println(textoSinEspacios);
		System.out.println(textoSinNumeros);
		//System.out.println(textoSinNumeros);
		
		System.out.println("El texto tiene " + texto.length() + " ");
		
		
		
		
		
	}

}
