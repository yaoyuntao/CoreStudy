package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo3_1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建客户端套接字对象
		Socket socket = new Socket("127.0.0.1", 8888);
		//建立输出流，用于发送数据
		OutputStream outputStream = socket.getOutputStream();
		//发送数据
		outputStream.write("你好TCP".getBytes());
		
		InputStream inputStream = socket.getInputStream();
		byte[] data = new byte[1024];
		int length = inputStream.read(data);
		System.out.println(new String(data, 0 ,length));

		inputStream.close();
		outputStream.close();
		socket.close();
	}
}
