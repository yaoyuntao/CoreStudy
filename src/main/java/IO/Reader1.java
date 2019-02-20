package IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流
 * @author hancy
 * 2017年8月26日
 */
public class Reader1 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:\\a.txt");
		
		char[] chars = new char[1024];
		
		int length = 0;
		
		while((length = reader.read(chars)) != -1){
			System.out.println(new String(chars, 0, length));
		}
		
		reader.close();
	}
}
