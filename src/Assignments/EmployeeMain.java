package Assignments;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanString = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
//		String name;
//		String employeecode;
//		int age;
//		String address;
//		int phonenumber;

		System.out.println("How many employess do you want?");
		int number = scanInt.nextInt();

//		AccountAndFinance[] totalAccountAndFinance = new AccountAndFinance(null, null, number, null, number, null)

		Employee[] totalemployee = new Employee[number];

		for (int i = 0; i < totalemployee.length; i++) {
			System.out.println("Name: ");
			String name = scanString.nextLine();
			System.out.println("Employee Code: ");
			String employeecode = scanString.nextLine();
			System.out.println("Age: ");
			int age = scanInt.nextInt();
//			scanString.nextLine();
			System.out.println("Address: ");
			String address = scanString.nextLine();
			System.out.println("Phone Number: ");
			int phonenumber = scanInt.nextInt();
			System.out.println();

			totalemployee[i] = new Employee(name, employeecode, age, address, phonenumber);
		}
		for (int i = 0; i < totalemployee.length; i++) {
			System.out.println(totalemployee[i].toString() + "\n");
		}

	}

}
