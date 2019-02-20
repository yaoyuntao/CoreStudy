package 网络编程;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo4_1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建客户端套接字对象
		Socket socket = new Socket("127.0.0.1", 8888);
		//建立输出流，用于发送数据
		OutputStream outputStream = socket.getOutputStream();
		//创建字节流，读取本地图片资源
		FileInputStream fileInputStream = new FileInputStream("D:\\Pictures\\a.jpg");
		int length = 0;
		byte[] data = new byte[1024];
		while((length = fileInputStream.read(data)) != -1){
			outputStream.write(data, 0, length);
		}
		//给服务器写终止序列
		socket.shutdownOutput();
		
		//获取输入流
		InputStream inputStream = socket.getInputStream();
		length = inputStream.read(data);
		System.out.println(new String(data, 0 ,length));

		inputStream.close();
		fileInputStream.close();
		outputStream.close();
		socket.close();
	}
}
