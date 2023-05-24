package Assignments;

import java.util.ArrayList;

public class SalesAndMarketing extends Employee {

//	ArrayList<String> duty = new ArrayList<String>();{
//		duty.add("Generating unique sales plans");
//		duty.add("Promoting company's brands");
//		duty.add("Introducing new products to the market");
//		duty.add("Researching and developing new markets");
//	}
	private String department;
	private String qualification;

	SalesAndMarketing(String name, String employeecode, int age, String address, int phonenumber, String department,
			String qualification) {
		super(name, employeecode, age, address, phonenumber);
		this.setDepartment(department);
		this.setQualification(qualification);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
