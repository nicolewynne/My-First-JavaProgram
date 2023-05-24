package TwoFilesJava;

public class Garage {

	void park(CarforParking car) {
		System.out.println("The " + car.name + " is parked");
	}

	void park(Cycle cycle) {
		System.out.println("The " + cycle.name + " is parked");
	}
}
