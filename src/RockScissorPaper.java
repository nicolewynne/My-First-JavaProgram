import java.util.Scanner;
import java.util.Random;

public class RockScissorPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int playerScore = 0, computerScore = 0;

		String confirmInput;

		do {

			Random random = new Random();

			getInstructions();

			int player1 = scanner.nextInt();
			printP1Weapon(player1);

			int player2 = random.nextInt(2);
			printP2Weapon(player2);

			int scores[] = calculate(player1, player2, playerScore, computerScore);

			System.out.println("\nYour Score - " + scores[0] + "\nComputer Score - " + scores[1] + "\n\n");

			confirmInput = confirm();

		} while (confirmInput.equals("yes"));

		System.out.println("The game is finished!");

	}

	static void getInstructions() {
		System.out.println("type 0 for rock");
		System.out.println("type 1 for scissor");
		System.out.println("type 2 for paper");
		System.out.println("Rock Paper Scissor!");
	}

	static void printP1Weapon(int player1) {

		if (player1 < 0 || player1 > 2) {
			System.out.println("Invalid Input");
		}

		switch (player1) {
		case (0):
			System.out.println("You chose rock");
			break;
		case (1):
			System.out.println("You chose scissor");
			break;
		case (2):
			System.out.println("You chose paper");
		}

	}

	static void printP2Weapon(int player2) {

		switch (player2) {
		case (0):
			System.out.println("Nigga chose rock");
			break;
		case (1):
			System.out.println("Nigga chose scissor");
			break;
		case (2):
			System.out.println("Nigga chose paper");
		}

	}

	static int[] calculate(int player1, int player2, int playerScore, int computerScore) {

		if (player1 == 0 && player2 == 0) {
			System.out.println("Your Honours are the same");
		} else if (player1 == 0 && player2 == 1) {
			System.out.println("You win");
			playerScore++;
		} else if (player1 == 0 && player2 == 2) {
			System.out.println("You lose");
			computerScore++;
		} else if (player1 == 1 && player2 == 0) {
			System.out.println("You lose");
			computerScore++;
		} else if (player1 == 1 && player2 == 1) {
			System.out.println("Your Honours are the same");
		} else if (player1 == 1 && player2 == 2) {
			System.out.println("You win");
			playerScore++;
		} else if (player1 == 2 && player2 == 0) {
			System.out.println("You win");
			playerScore++;
		} else if (player1 == 2 && player2 == 1) {
			System.out.println("You lose");
			computerScore++;
		} else {
			System.out.println("Your Honours are the same");
		}

		int scores[] = { playerScore, computerScore };

		return scores;

	}

	static String confirm() {

		Scanner scanConfirm = new Scanner(System.in);

		System.out.println("Do you want to play again? (yes/no)");
		return scanConfirm.nextLine();
	}

}
