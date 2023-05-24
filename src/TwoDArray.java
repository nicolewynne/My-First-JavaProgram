
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    2D array = an array of arrays
		String[][] cars = new String[3][3];

		cars[0][0] = "Ferrari";
		cars[0][1] = "Cardillac";
		cars[0][2] = "Mercedes";
		cars[1][0] = "BMW";
		cars[1][1] = "Porsche";
		cars[1][2] = "Lambo";
		cars[2][0] = "Jaguar";
		cars[2][1] = "Range Rover";
		cars[2][2] = "Bughatti";

		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}

		}
	}

}
