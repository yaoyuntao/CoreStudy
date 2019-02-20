package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流
 * 注：
 * 		1.字节流每次操作一个字节，故不适合操作汉字（一个汉字两个字节）
 * 		2.每次写入会覆盖之前的数据
 * @author hancy
 * 2017年8月26日
 */
public class OutputStream1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("D:\\a.txt");
		
		outputStream.write(97);
		
		byte[] bytes = {97, 98, 99, 100};
		
		outputStream.write(bytes);
		//从下标为2的数组开始写入，一共写入2个
		outputStream.write(bytes, 2, 2);
		
		outputStream.write("test".getBytes());
		
		outputStream.close();
	}

}
