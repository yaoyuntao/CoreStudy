package IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 * @author hancy
 * 2017年8月26日
 */
public class Writer1 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("D:\\a.txt");
		writer.write(100);
		writer.flush();
		
		char[] a = {'a','b','c','d'};
		writer.write(a);
		writer.flush();
		writer.write(a, 2 , 2);
		writer.flush();
		writer.write("测试");
		writer.flush();
		writer.close();
	}
}
