package TwoFiles2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader("art.txt");
			try {
				int data = reader.read();
				while (data != -1) {
					System.out.print((char) data);
					data = reader.read();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
