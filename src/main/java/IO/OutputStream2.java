package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 续写：在构造方法的参数加上true可以续写文件、
 * 换行：\r\n
 * @author hancy
 * 2017年8月26日
 */
public class OutputStream2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("D:\\a.txt", true);
		
		outputStream.write(97);
		outputStream.write("\r\ntest".getBytes());
		
		outputStream.close();
	}

}
