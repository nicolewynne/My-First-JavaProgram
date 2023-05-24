import java.util.Scanner;

public class ThreeLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * logical operators = used to connect two or more expresions && = (AND) both
		 * conditions must be true || = (OR) either condition must be true ! = (NOT)
		 * reverse boolean value of condition
		 */
//	for example
////		for &&
		int temp = 33;
		if (temp > 30) {
			System.out.println("It is hot outside");
		} else if (temp > 20 && temp <= 30) {
			System.out.println("It is warm outside");
		} else {
			System.out.println("It is cold outside");
		}

//	for ||
		Scanner scanner = new Scanner(System.in);

		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You are still playing the game");
		}

//For !
		if (!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game");
		} else {
			System.out.println("You quit the game");
		}

	}

}
