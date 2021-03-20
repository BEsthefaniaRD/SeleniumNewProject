package polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {

		Vehiculo misVehiculos[] = new Vehiculo[4];
		misVehiculos[0] = new Vehiculo("BERD11", "BERD12", "BERD13");
		misVehiculos[1] = new VehiculoTurismo(8, "BERD123", "AUDI", "2012");
		misVehiculos[2] = new VehiculoDeportivo("BERD123", "MAZDA", "2020", 8);
		misVehiculos[3] = new VehiculoFurgoneta("BERD123", "TOYOTA", "2021", 8);

		for (Vehiculo vehiculos : misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}

		Vehiculo vehiculodeportivo = new VehiculoDeportivo("BERD123", "AUDI", "2012", 22);
		System.out.println(vehiculodeportivo.mostrarDatos());
	}
}
