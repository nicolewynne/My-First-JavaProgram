import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Array list = a resizable array; Elements can be added and removed after
		 * compilation phase; store reference data type.
		 */
//		ArrayList<String> food = new ArrayList<String>();
//		
//		food.add("Hotdog");
//		food.add("Burgar");
//		food.add("Sandwich");
//		food.add("Hotpot");
//		
//		food.set(0,"Shan Kaw");
//		food.remove(2);
//		food.clear();
//		for(int i=0; i<food.size(); i++) {
//			System.out.println(food.get(i));
//		}
		ArrayList<String> singer = new ArrayList<String>();

		singer.add("Taylor Swift");
		singer.add("Harry Styles");
		singer.add("Chris Martin");
		singer.add("Billie Eilish");
		singer.add("Ed Sheeran");

//		singer.set(1, "David Bowie");
//		singer.remove(3);
//		singer.clear();
//		
		for (int i = 0; i < singer.size(); i++) {
			System.out.println(singer.get(i));
		}
//		System.out.println(singer);
	}

}
