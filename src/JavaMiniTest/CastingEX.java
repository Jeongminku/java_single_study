package JavaMiniTest;

public class CastingEX {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		vehicle.run();
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}

	}

}
