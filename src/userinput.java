import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();

		System.out.println("You are " + name);
		System.out.println("You are " + age);
		System.out.println("You like " + food);
	}

}
