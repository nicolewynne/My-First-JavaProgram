import java.util.Scanner;

public class findinghypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		double x;
		double y;
		double z;

		System.out.println("Enter side x: ");
		x = scanner.nextDouble();

		System.out.println("Enter side y: ");
		y = scanner.nextDouble();

		z = Math.sqrt((x * x) + (y * y));
		System.out.println("The hypotenuse is " + z);
	}

}
