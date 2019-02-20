package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲流-输出
 * @author hancy
 * 2017年8月26日
 */
public class BufferedOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\a.txt");
		java.io.BufferedOutputStream stream = new java.io.BufferedOutputStream(fileOutputStream);
		
		stream.write("测试".getBytes());
		
		stream.write(100);
		
		stream.close();

	}

}
