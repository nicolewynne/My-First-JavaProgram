
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     array = used to store multiples values in a single variable
//		String[] cars = {"Camaro", "Corvette","Mercedes","Tesla"};

//		cars[0]="Mustang";
//		System.out.println(cars[3]);

		// addional way to creat array
//		
		String[] cars = new String[4];
		cars[0] = "BMW";
		cars[1] = "Audi";
		cars[2] = "Cardillac";
		cars[3] = "Jacguar";

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}
}
