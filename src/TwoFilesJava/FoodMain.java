package TwoFilesJava;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food[] refrigerator = new Food[3];

		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburgar");
		Food food3 = new Food("hotdog");

		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;

		System.out.println(refrigerator[1].name);
	}

}
