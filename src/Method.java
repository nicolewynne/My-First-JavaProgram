
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      String name = "Nicole";
//      int age = 16;
//      hello("Nicole", 16);
		int x = sum(3, 4);
		int y = twice(x);
		double z = half(x);
		System.out.println(z);
	}

//	static void hello(String gg,int tt) {
//		System.out.println("Hello "+gg);
//	    System.out.println("You are "+tt+" years old");
//	}

	static int sum(int x, int y) {
		return x + y;
	}

//	
	static int twice(int x) {
		return x * 2;
	}

//	
	static int half(int x) {
		return x / 2;
	}
//	
}
