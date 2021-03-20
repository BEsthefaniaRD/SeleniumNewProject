package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {

		List<Integer> listaDeNumeros = new ArrayList<>();

		listaDeNumeros.add(300);
		listaDeNumeros.add(3);
		listaDeNumeros.add(99);
		listaDeNumeros.add(4);
		listaDeNumeros.add(6);
		listaDeNumeros.add(5);
		listaDeNumeros.add(99);
		listaDeNumeros.add(1);
		listaDeNumeros.add(99);
		listaDeNumeros.add(99);
		listaDeNumeros.add(99);

		// Impreme elementos de la lista
		System.out.println();
		System.out.println("Aqu� se imprimen todos los n�meros de la lista");
		System.out.println(listaDeNumeros);

		// Ordena numeros
		System.out.println();
		System.out.println("Aqu� ordena los n�meros de Menor a Mayor");
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);

		// Utileria. Ordenamos e invertimos el orden de nuestra lista
		System.out.println();
		System.out.println("Aqu� ordena los n�meros de Mayor a Menor");
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		// Imprime todos los elementos invertidos de la lista
		System.out.println(listaDeNumeros);

		// Quitar elemento repetidos en la lista
		Object last = null;

		int numCount = 0;
		Iterator<Integer> i = listaDeNumeros.iterator();

		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++;
			} else {
				last = temp;

			} // fin else

		} // fn while

		System.out.println();
		System.out.println("Aqu� imprime cuantas veces esta repetido el mismo n�mero");
		System.out.println("El n�mero estaba repetido " + numCount + " veces");

		System.out.println();
		System.out.println("Aqu� invertimos un orden ya invertido anteriormente");
		Collections.reverse(listaDeNumeros);
		System.out.println(listaDeNumeros);

		// TAREA: Como sacar el n�mero mayor y el n�mero menor de la lista

		/*
		System.out.println();
		System.out.println("Aqu� imprime el n�mero mayor");
		Collections.max(listaDeNumeros);
		System.out.println("El n�mero mayor de la lista es: " + (listaDeNumeros));
		
		
		System.out.println();
		System.out.println("Aqu� imprime el n�mero menor");
		Collections.min(listaDeNumeros);
		System.out.println("El n�mero menor de la lista es: " + listaDeNumeros);

		*/
		System.out.println();
		System.out.println("Aqu� imprimimos el numero MAYOR y menor");
		 System.out.println("Aqu� imprime el n�mero mayor: " + Collections.max(listaDeNumeros));
		 System.out.println("Aqu� imprime el n�mero menor: " + Collections.min(listaDeNumeros));
		 
	}// main

}// class
