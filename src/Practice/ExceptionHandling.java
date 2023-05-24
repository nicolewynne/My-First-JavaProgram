package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();

			int z = x / y;
			System.out.println("The result is: " + z);
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("Your have to enter number");
		} finally {
			scanner.close();
		}

	}

}
