package javabasics;

public class MainMetodos {
	
	public static void main (String [] args) {
		
		Metodos met = new Metodos(10,20);
		//Metodos constructorAutomatico = new Metodos();
		
		System.out.println(met.sumatoria());
		met.mensajeBienvenida();
		met.mostrarNombre("Fani");
		//String name = met.mostrarNombre("Fani");
		//System.out.println(constructorAutomatico.sumatoria());
		//System.out.println(constructorAutomatico.mensajeBienvenida());

	}

}
