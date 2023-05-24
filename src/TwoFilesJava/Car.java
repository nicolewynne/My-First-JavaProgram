package TwoFilesJava;

public class Car {
	String make = "Marcedes";
	String model = "Maybach";
	int year = 2020;
	String color = "Black";
	double price = 500000;

	void drive() {
		System.out.println("You drive the car");
	}

	void brake() {
		System.out.println("You step on the brake");
	}

	public String toString() {

		String myString = make + "\n" + model + "\n" + color + "\n" + year;
		return myString;
	}
}