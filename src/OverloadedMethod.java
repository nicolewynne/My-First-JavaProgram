
public class OverloadedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = add(65, 26);

		System.out.println(x);
	}

	static int add(int a, int b) {
		System.out.println("This is Over-loaded Method#1");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("This is Over-loaded Method#2");
		return a + b + c;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("This is Over-loaded Method#3");
		return a + b + c + d;
	}

	static int add(int a, int b, int c, int d, int e) {
		System.out.println("This is Over-loaded Method#4");
		return a + b + c + d + e;
	}

	static double add(double a, double b) {
		System.out.println("This is Over-loaded Method#5");
		return a + b;
	}

	static double add(double a, double b, double c) {
		System.out.println("This is Over-loaded Method#6");
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		System.out.println("This is Over-loaded Method#7");
		return a + b + c + d;
	}

	static double add(double a, double b, double c, double d, double e) {
		System.out.println("This is Over-loaded Method#8");
		return a + b + c + d + e;
	}
}
