package TwoFiles2;

public class PolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toner toner = new Toner();
		Serum serum = new Serum();
		Moisturizer moisturizer = new Moisturizer();
		BeautyProducts bp = new Serum();
		bp.affect();

//		BeautyProducts[] skincare = {toner, serum, moisturizer};
//		
//		for(BeautyProducts x: skincare) {
//			x.affect();
//		}
	}

}
