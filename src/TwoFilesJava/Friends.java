package TwoFilesJava;

public class Friends {
	String name;
	static int numberOfFriends;

	Friends(String name) {
		this.name = name;
		numberOfFriends++;
	}

	static void display() {
		System.out.println("You have " + numberOfFriends + " friends");
	}
}
