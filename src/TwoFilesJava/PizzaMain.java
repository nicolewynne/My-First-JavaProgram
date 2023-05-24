package TwoFilesJava;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza("Thick Bread", "Tomato", "Mozarella", "Pepperoni");
		System.out.println("Here is your ingrediants for pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}

}
