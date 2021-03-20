package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeStrings {

	public static void main(String[] args) {
		List<String> listaDeNombres = new ArrayList<>();

		listaDeNombres.add("Olga");
		listaDeNombres.add("Mildred");
		listaDeNombres.add("Magali");
		listaDeNombres.add("Eligio");
		listaDeNombres.add("Kevin");
		listaDeNombres.add("Chris");
		listaDeNombres.add("Esthefania");
		listaDeNombres.add("Luis");
		listaDeNombres.add("Manuel");
		listaDeNombres.add("Saul");
		listaDeNombres.add("Esthefania");
		listaDeNombres.add("Esthefania");
		listaDeNombres.add("Isra");
		listaDeNombres.add("Uli");
		listaDeNombres.add("Brenda");
		
		
		System.out.println("Aquí se imprimen todos los nombres: ");
		System.out.println(listaDeNombres);
		
		System.out.println();
		System.out.println("Aquí se imprimen todos los nombres ordenados de la A a la Z: ");
		Collections.sort(listaDeNombres);
		System.out.println(listaDeNombres);
				
		System.out.println();
		System.out.println("Aquí se imprimen todos los nombres ordenados de la Z a la A: ");
		Collections.sort(listaDeNombres, Collections.reverseOrder());
		System.out.println(listaDeNombres);
		
		System.out.println();
		System.out.println("Aquí invertimos un orden ya invertido anteriormente ");
		Collections.reverse(listaDeNombres);
		System.out.println(listaDeNombres);

		// Eliminar los elementos repetidos de la lista de Strings
		System.out.println();
		System.out.println("Aquí se eliminan de la lista los nombre repetidos: ");
		List<String> nombresSinRepetir = listaDeNombres.stream().distinct().collect(Collectors.toList());
		System.out.println(nombresSinRepetir);
	}// main

}// class
