package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle vehicle = new Vehicle();
		Car car1 = new Car("Cardillac", "Eldorado", 2020);
//		Car car2 = new Car("Mercedes", "Benz", 2021);
		Car car2 = new Car(car1);
//		car2.copy(car1);
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
