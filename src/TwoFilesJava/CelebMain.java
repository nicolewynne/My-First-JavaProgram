
package TwoFilesJava;

public class CelebMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celeb celeb1 = new Celeb("Taylor Swift", "Singer", 32);
		Celeb celeb2 = new Celeb("Millie", "Actress", 18);
//		Celeb celeb2 = new Celeb(celeb1);
//		celeb2.copy(celeb1);

//		celeb2.setName("babe");
//		System.out.println(celeb1);
//		System.out.println(celeb2);
//		System.out.println();
		celeb1.setName("Selena");
		System.out.println(celeb1.getName());
		System.out.println(celeb1.getOccupation());
		System.out.println(celeb1.getAge());
		System.out.println();
		System.out.println(celeb2.getName());
		System.out.println(celeb2.getOccupation());
		System.out.println(celeb2.getAge());

	}

}
