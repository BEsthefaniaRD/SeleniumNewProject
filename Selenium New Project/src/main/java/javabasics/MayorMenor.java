package javabasics;

public class MayorMenor {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;

		if (num1 > num2) {
			// if(num1==num2) {
			// System.out.println("El " + num1 + " es igual al " + num2);
			// }
			System.out.println("El " + num1 + " es mayor al " + num2);
		} else if (num1 == num2) {
			System.out.println("El " + num1 + " es igual al " + num2);
		} else {
			System.out.println("El " + num1 + " es menor al " + num2);
		}
	}

}
