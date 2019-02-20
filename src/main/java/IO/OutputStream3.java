package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理
 * @author hancy
 * 2017年8月26日
 */
public class OutputStream3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream("D:\\a.txt");
			outputStream.write(97);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			outputStream.close();
		}
	}

}
