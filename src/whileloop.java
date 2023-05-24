import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     while loop = executes a block of code as long as its condition remains true, can repeat infinitely.
		Scanner scanner = new Scanner(System.in);
		String name = "";

		while (name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Hello " + name);
	}

}
