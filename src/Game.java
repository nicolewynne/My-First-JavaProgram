import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanInput = new Scanner(System.in);

		int player1;
		int player2;
		int player1score = 0;
		int player2score = 0;
		String confirmInput;
		do {

			Random random = new Random();

			int scores[];
			do {

				getInstrution();
				startGame();

				player1 = scanInput.nextInt();
				printP1Weapon(player1);

				player2 = random.nextInt(3);
				printP2Weapon(player2);

				scores = caculate(player1, player2, player1score, player2score);
				System.out.println("\nYour score - " + scores[0] + "\nNigga score - " + scores[1] + "\n\n");

			} while (scores[0] < 3 && scores[1] < 3);

			confirmInput = confirm();

		} while (confirmInput.equals("yes"));

		System.out.println("The game finished");

	}

	static void getInstrution() {
		System.out.println("Type 0 for rock");
		System.out.println("Type 1 for scissor");
		System.out.println("Type 2 for paper");
	}

	static void startGame() {
		System.out.println("Lets start!");
	}

	static void printP1Weapon(int player1) {
		if (player1 < 0 || player1 > 2) {
			System.out.println("Input Invalid");
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

	static int[] caculate(int player1, int player2, int player1score, int player2score) {
		if (player1 == 0 && player2 == 0) {
			System.out.println("Your honours are the same");
		} else if (player1 == 0 && player2 == 1) {
			System.out.println("You Win");
			player1score++;
		} else if (player1 == 0 && player2 == 2) {
			System.out.println("You lose");
			player2score++;
		} else if (player1 == 1 && player2 == 0) {
			System.out.println("You lose");
			player2score++;
		} else if (player1 == 1 && player2 == 1) {
			System.out.println("Your honours are the same");
		} else if (player1 == 1 && player2 == 2) {
			System.out.println("You win");
			player1score++;
		} else if (player1 == 2 && player2 == 0) {
			System.out.println("You win");
			player1score++;
		} else if (player1 == 2 && player2 == 1) {
			System.out.println("You lose");
			player2score++;
		} else {
			System.out.println("Your honours are the same");
		}
		int[] scores = { player1score, player2score };
		return scores;
	}

	static String confirm() {
		Scanner scanConfirm = new Scanner(System.in);
		System.out.println("Do you want to continue the game? yes or No.");
		return scanConfirm.nextLine();
	}

}