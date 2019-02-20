package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("D:\\a.txt");
		java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);

		String line = null;
		while((line = bufferedReader.readLine()) != null){
			System.out.println(line);
		}
		bufferedReader.close();
	}
}
