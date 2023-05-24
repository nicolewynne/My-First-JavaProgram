package TwoFiles2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("myself.txt");
			writer.write("I am Nicole. \nI am future Taylor Swift's best friend and music partner");
			writer.append("\n(About Me)");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
