package javabasics;

public class SumaArreglo {

	public static void main(String[] args) {

		int[] numeros = new int[2];
		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			suma += numeros[i];
			// suma = suma + numeros[i];
			
		}

		System.out.println(suma);
		
	}

}
