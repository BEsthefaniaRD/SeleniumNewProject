package POO;

import comun.LeerProperties;

public class TestProperties {

	public static void main(String[] args) {

		LeerProperties prop = new LeerProperties();

		prop.getSystemProperties();

		String mensaje1 = System.getProperty("MENSAJE1");
		String mensaje2 = System.getProperty("MENSAJE2");
		String mensaje3 = System.getProperty("MENSAJE3");
		int numero = Integer.parseInt(System.getProperty("NUMERO"));
		System.out.println();

		System.out.println(mensaje1);
		System.out.println(mensaje2);
		System.out.println(mensaje3);
		System.out.println(numero);

		prop.setSystemPropFileName(
				System.getProperty("user.dir") + "\\src\\main\\resources\\dataFiles\\datafIle2.properties");
		prop.getSystemProperties();
		String archivo = System.getProperty("MENSAJE11");
		String archivo2 = System.getProperty("MENSAJE22");

		System.out.println(archivo);
		System.out.println(archivo2);
	}

}
