
public class Swap2Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "water";
		String y = "Kool Aid";
		String temp;
//		temp is a temporary value
		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}
}