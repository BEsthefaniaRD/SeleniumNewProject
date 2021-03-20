package POO2;

public class TestEmpleado {

	public static void main(String[] args) {
		
		//Instancear	//Constructor
		Empleado E1 = new Empleado("Fani");
		Directivo D1 = new Directivo("Brenda");
		Operario OP1 = new Operario("Luis");
		Oficial OF1 = new Oficial("Manuel");
		Tecnico T1 = new Tecnico("Kevin");
		Empleado E2 = new Tecnico(" *Fani* ");
		
		System.out.println(E1);
		System.out.println("");
		System.out.println(D1.toString());
		System.out.println("");
		System.out.println(OP1);
		System.out.println("");
		System.out.println(OF1);
		System.out.println("");
		System.out.println(T1);
		System.out.println("");
		System.out.println(E2.toString());
		
		
	}

}
