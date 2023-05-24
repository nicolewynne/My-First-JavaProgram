import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2Darraylist = a dynamic list of lists
		ArrayList<ArrayList<String>> tobuyList = new ArrayList<ArrayList<String>>();
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pork");
		food.add("Water Cress");
		food.add("Cabbage");
		food.add("Mustard Leaf");

		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Grape Juice");
		drinks.add("Kiwi Juice");
		drinks.add("Chocolate");
		drinks.add("Milk Tea");

		ArrayList<String> sauce = new ArrayList<String>();
		sauce.add("Tomato Sauce");
		sauce.add("Chilli Sauce");
		sauce.add("Soy Sauce");
		sauce.add("Fish Sauce");

		tobuyList.add(food);
		tobuyList.add(drinks);
		tobuyList.add(sauce);

		System.out.println(tobuyList.get(2).get(0));
	}

}
