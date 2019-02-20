package IO;

import java.io.FileInputStream;
import java.io.IOException;
/**
 * 字节缓冲流-输入
 * @author hancy
 * 2017年8月26日
 */
public class BufferedInputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("D:\\a.txt");
		java.io.BufferedInputStream stream = new java.io.BufferedInputStream(fileInputStream);
		
		byte[] bytes = new byte[1024];
		int length = 0;
		while((length = stream.read(bytes)) != -1){
			System.out.println(new String(bytes, 0, length));
		}
		
		stream.close();

	}

}
