package TwoFiles2;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("secret_message.txt");

		if (file.exists()) {
			System.out.println("This file exists");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		} else {
			System.out.println("This file doesn't exists");
		}
	}

}
