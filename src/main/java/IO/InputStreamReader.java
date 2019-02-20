package IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 转换流-输入
 * @author hancy
 * 2017年8月26日
 */
public class InputStreamReader {

	public static void main(String[] args) throws IOException {
		gbk();
		utf8();

	}

	/**
	 * 使用gbk编码打开gbk编码的文件
	 * @throws IOException
	 */
	public static void gbk() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\b.txt");
		java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
		char[] chars = new char[1024];
		int length = 0;
		while((length = inputStreamReader.read(chars)) != -1){
			System.out.println(new String(chars, 0, length));
		}
		inputStreamReader.close();
	}
	
	/**
	 * 使用utf8编码打开utf8编码的文件
	 * @throws IOException
	 */
	public static void utf8() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\c.txt");
		java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream, "utf-8");
		char[] chars = new char[1024];
		int length = 0;
		while((length = inputStreamReader.read(chars)) != -1){
			System.out.println(new String(chars, 0, length));
		}
		inputStreamReader.close();
	}

}
