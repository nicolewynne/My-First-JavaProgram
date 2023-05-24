package TwoFilesJava;

public class Celeb {
	private String name;
	private String occupation;
	private int age;

	Celeb(String name, String occupation, int age) {
		this.setName(name);
		this.setOccupation(occupation);
		this.setAge(age);
	}

	Celeb(Celeb x) {
		this.copy(x);
	}

	public String getName() {
		return name;
	}

	public String getOccupation() {
		return occupation;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void copy(Celeb x) {
		this.setName(x.getName());
		this.setOccupation(x.getOccupation());
		this.setAge(x.getAge());
	}
}
