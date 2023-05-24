package TwoFiles2;

import java.util.Scanner;

public class DynamicPolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		Instruments instrument;

		System.out.println("What instrument do you want to play?");
		System.out.println("(1=piano) or (2=guitar)");
		int choice = scanner.nextInt();

		if (choice == 1) {
			instrument = new Piano();
			instrument.play();
		} else if (choice == 2) {
			instrument = new Guitar();
			instrument.play();
		} else {
			instrument = new Instruments();
			System.out.println("Your choice was invalid");
			instrument.play();
		}
	}

}
