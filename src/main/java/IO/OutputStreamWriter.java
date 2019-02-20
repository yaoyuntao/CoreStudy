package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 转换流-输出
 * @author hancy
 * 2017年8月26日
 */
public class OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		gbk();
		utf8();

	}

	public static void gbk() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\b.txt");
		java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(fileOutputStream);
		outputStreamWriter.write("你好");
		outputStreamWriter.close();
	}
	
	public static void utf8() throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\c.txt");
		java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(fileOutputStream, "utf-8");
		outputStreamWriter.write("你好");
		outputStreamWriter.close();
	}

}
