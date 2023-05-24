package TwoFilesJava;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human("Brooke", 68, 60);
		Human human2 = new Human("Micheal", 23, 50);

		System.out.println(human2.weight);

		human1.eat();
		human2.drink();
	}

}
