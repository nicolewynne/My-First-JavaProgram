import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     String[] animals = {"cat", "dog","seal","pig"};
		ArrayList<String> animals = new ArrayList();
		animals.add("cat");
		animals.add("dog");
		animals.add("seal");
		animals.add("pig");
		for (String i : animals) {
			System.out.println(i);
		}
	}

}
