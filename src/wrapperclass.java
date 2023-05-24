
public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      wrapper classes= provides a way to use primitive data types as reference data types.Reference data
//		                 types contain useful methods.can be used with collections(eg. Array List)
//		Autoboxing= automatic coversion that java compiler makes between primitive data types and corresponding
//		             object wrapper class
//		Unboxing = the reverse of autoboxing
//		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;

//		we can also treat above  primitive variables enclosed within wrapper classes as if they were standard primitive
//		because of unboxing features

		if (a == true) {
			System.out.println("This is True");
		}

	}

}
