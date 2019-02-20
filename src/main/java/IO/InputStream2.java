package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输入流和输出流实现文件的复制
 * @author hancy
 * 2017年8月26日
 */
public class InputStream2 {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("D:\\b.exe");
			outputStream = new FileOutputStream("E:\\b.exe");
			byte[] bytes = new byte[1024*10];
			int length = 0;
			while((length = inputStream.read(bytes)) != -1){
				outputStream.write(bytes, 0, length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
			outputStream.close();
			
			long endTime = System.currentTimeMillis();
			System.out.println(endTime-startTime);
		}
	}

}
