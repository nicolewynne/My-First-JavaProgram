import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int rows;
		int columns;
		String symbol = "$";

//      System.out.println("Number of rows");
//      rows = scanner.nextInt();
//      System.out.println("number of columns");
//      columns = scanner.nextInt();

		rows = 5;
		columns = 5;
//
//      for(int i=0; i<rows; i++) {
//    	  System.out.println();
//    	  for(int j=0; j<i+1; j++) {
//    		  System.out.print(symbol);
//    	  }
//      }
//      for(int i=0; i<rows; i++) {
//    	  System.out.println();
//    	  for(int j=5; j>i; j-- ) {
//    		  System.out.print(symbol);
//    	  }
//      }
//     for(int i=0; i<rows; i++) {
//    	 for(int j=4; j>i; j--) {
//    		 System.out.print(" ");
//    	 }
//    	 for(int k=0; k<=i; k++) {
//    		 System.out.print(symbol);
//    		  }
//    	 System.out.println();
//     }
//      
		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				System.out.print(symbol);
			}

			System.out.println();
		}
	}

}
