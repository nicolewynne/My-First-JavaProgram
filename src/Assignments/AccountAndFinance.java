package Assignments;

import java.util.ArrayList;

public class AccountAndFinance extends Employee {

//	ArrayList<String> duty = new ArrayList<String>();{
//		duty.add("Financial planning");
//		duty.add("Financial reports and controls");
//		duty.add("Managing investments");
//	}
	private String department;
	private String qualification;

	AccountAndFinance(String name, String employeecode, int age, String address, int phonenumber, String department,
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
