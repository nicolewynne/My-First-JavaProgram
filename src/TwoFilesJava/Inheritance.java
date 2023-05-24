package TwoFilesJava;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2nd car = new Car2nd();
		car.go();

		Bicycle bike = new Bicycle();
		bike.stop();

		System.out.println(car.doors);
		System.out.println(bike.pedals);
		System.out.println(bike.wheels);
		System.out.println(car.wheels);
	}

}
