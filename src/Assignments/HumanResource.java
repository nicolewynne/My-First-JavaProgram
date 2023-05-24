package Assignments;

import java.util.ArrayList;

public class HumanResource extends Employee {

//	ArrayList<String> duty = new ArrayList<String>();{
//		duty.add("Recruiting employees");
//		duty.add("Arranging Interviews");
//		duty.add("Processing payroll");
//		duty.add("Conducting displinary actions");
//		duty.add("Maintaining employees' records");
//		}
	private String department;
	private String qualification;

	HumanResource(String name, String employeecode, int age, String address, int phonenumber, String department,
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
