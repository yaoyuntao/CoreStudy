package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo3_2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建服务器端套接字对象
		ServerSocket serverSocket = new ServerSocket(8888);
		//获取客户端套接字对象
		Socket socket = serverSocket.accept();
		//建立输入流，用于接收数据
		InputStream inputStream = socket.getInputStream();
		//定义字节数组，用于存储接收到的数据
		byte data[] = new byte[1024];
		//获取接收的数据长度
		int length = inputStream.read(data);
		System.out.println(new String(data, 0, length));
		
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("收到了,谢谢!".getBytes());
		
		outputStream.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
	}
}
