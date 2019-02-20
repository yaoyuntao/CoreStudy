package IO;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("D:\\a.txt");
		java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(fileWriter);
		bufferedWriter.write("测试");
		bufferedWriter.flush();
		//换行
		bufferedWriter.newLine();
		bufferedWriter.write(100);
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
