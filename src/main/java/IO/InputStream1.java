package IO;

import java.io.FileInputStream;
import java.io.IOException;



/**
 * 字节输入流
 * 注：
 * 		每次只读一个字节
 * 		read方法如果读取到末尾则返回-1
 * @author hancy
 * 2017年8月26日
 */
public class InputStream1 {

	public static void main(String[] args) throws IOException {
		FileInputStream inputStream = new FileInputStream("D:\\a.txt");
		
//		int a = inputStream.read();
//		System.out.println(a);
//		
//		byte[] bytes = new byte[1024];
//		int bytesLength = inputStream.read(bytes);
//		System.out.println(new String(bytes));
//		System.out.println(bytesLength);
//		
//		System.out.println("------------------------");
//		
//		
//		int length = 0;
//		while((length = inputStream.read()) != -1){
//			System.out.print((char)length);
//		}
		
		byte[] bytes = new byte[1024];		
		int length = 0;
		//每次读取1024个字节
		//inputStream.read(bytes)返回的是每次读取的字符长度
		while((length = inputStream.read(bytes)) != -1){
			System.out.print(new String(bytes, 0, length));
		}

/*
		//不能这样写
		//1.要保证read方法是从第0个下标开始读
		//2.应为每调一定read方法，自动往后读一个字节，代码中调用了多次read，取出的值就变了
		while(inputStream.read() != -1){
			System.out.print((char)inputStream.read());
		}
*/
		inputStream.close();
	}

}
