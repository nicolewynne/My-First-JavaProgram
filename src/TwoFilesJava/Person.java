package TwoFilesJava;

public class Person {
	String name;
	int age;

	Person(String a, int b) {
		this.name = a;
		this.age = b;
	}

	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
}
