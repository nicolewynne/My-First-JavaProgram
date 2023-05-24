import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
//		Scanner scanner = new Scanner(System.in);

			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();

			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();

			int z = x / y;
			System.out.println("The result is " + z);
		} catch (ArithmeticException e) {
			System.out.println("You can't divide a number by zero!IDIOTS!");
		} catch (InputMismatchException e) {
			System.out.println("Please enter a number!");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		} finally {
			scanner.close();
		}

	}

}
