package Assignments;

import java.util.Scanner;

public class Employee {
	private String name;
	private String employeecode;
	private int age;
	private String address;
	private int phonenumber;

	Scanner scanner = new Scanner(System.in);

	Employee(String name, String employeecode, int age, String address, int phonenumber) {
		this.setName(name);
		this.setEmployeeCode(employeecode);
		this.setAge(age);
		this.setAddress(address);
		this.setPhoneNumber(phonenumber);
	}

	public String getName() {
		return name;
	}

	public String getEmployeeCode() {
		return employeecode;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public int getPhoneNumber() {
		return phonenumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeCode(String employeecode) {
		this.employeecode = employeecode;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String toString() {
		return getName() + "\n" + getEmployeeCode() + "\n" + getAge() + "\n" + getAddress() + "\n" + getPhoneNumber();
	}

}
