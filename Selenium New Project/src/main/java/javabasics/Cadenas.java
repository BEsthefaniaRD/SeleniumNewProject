package javabasics;

public class Cadenas {
	

	public static void main(String[] args) {
		
		String cadena = "Hola Curso Selenium";
		
		//cadena.substring(0);
		
		//cadena.charAt(0);
		
		//System.out.println(sCadena.charAt(5));
		
		String subcadena = cadena.substring(0,4);
		
		System.out.println(subcadena);
		
		System.out.println(cadena.charAt(1));
		
		//System.out.println(cadena);
		
		
		//Compara cadenas
		if(cadena.equals("Hola Curso Selenium")) {
			System.out.println("Las cadenas son iguales");
			
		}else {
			System.out.println("Las cadenas no son iguales");
			
		}
		//Verifica si esta el elemento
		if(cadena.contains("Curso")) {
			System.out.println("Si esta el elemento");
			
		}else {
			System.out.println("No esta el elemento");
			
		}
		//Compara cadenas e ignora Mayusculas y minusculas
		if(cadena.equalsIgnoreCase("Curso")) {
			System.out.println("Si es igual");
			
		}else {
			System.out.println("No es igual");
			
		}
		
	}

}
