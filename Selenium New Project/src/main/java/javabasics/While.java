package javabasics;

public class While {

	public static void main(String[] args) {
		
		int numero = 1;
		
		while( numero <= 100 ) {
			System.out.println(numero);
			//numero = numero + 1;
			
			if( numero == 22) {
				break;
			}
			numero++;
			
		}
		
		System.out.println();
		for( int i = 1; i <= 100; i++) {
			System.out.println(i);
			
		}

	}

}
