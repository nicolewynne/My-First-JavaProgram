package TwoFilesJava;

public class CarParkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarforParking car1 = new CarforParking("Cardillacs");
		CarforParking car2 = new CarforParking("Mercedes");

		Cycle cycle = new Cycle("Yamaha");
		Garage garage = new Garage();

		garage.park(car2);
		garage.park(cycle);
	}

}
