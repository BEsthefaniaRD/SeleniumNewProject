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
		System.out.println("Aquí se imprimen todos los números de la lista");
		System.out.println(listaDeNumeros);

		// Ordena numeros
		System.out.println();
		System.out.println("Aquí ordena los números de Menor a Mayor");
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);

		// Utileria. Ordenamos e invertimos el orden de nuestra lista
		System.out.println();
		System.out.println("Aquí ordena los números de Mayor a Menor");
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
		System.out.println("Aquí imprime cuantas veces esta repetido el mismo número");
		System.out.println("El número estaba repetido " + numCount + " veces");

		System.out.println();
		System.out.println("Aquí invertimos un orden ya invertido anteriormente");
		Collections.reverse(listaDeNumeros);
		System.out.println(listaDeNumeros);

		// TAREA: Como sacar el número mayor y el número menor de la lista

		/*
		System.out.println();
		System.out.println("Aquí imprime el número mayor");
		Collections.max(listaDeNumeros);
		System.out.println("El número mayor de la lista es: " + (listaDeNumeros));
		
		
		System.out.println();
		System.out.println("Aquí imprime el número menor");
		Collections.min(listaDeNumeros);
		System.out.println("El número menor de la lista es: " + listaDeNumeros);

		*/
		System.out.println();
		System.out.println("Aquí imprimimos el numero MAYOR y menor");
		 System.out.println("Aquí imprime el número mayor: " + Collections.max(listaDeNumeros));
		 System.out.println("Aquí imprime el número menor: " + Collections.min(listaDeNumeros));
		 
	}// main

}// class
