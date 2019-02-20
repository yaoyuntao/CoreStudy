package 网络编程;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;


public class Demo4_2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建服务器端套接字对象
		ServerSocket serverSocket = new ServerSocket(8888);
		//获取客户端套接字对象
		Socket socket = serverSocket.accept();
		//建立输入流，用于接收数据
		InputStream inputStream = socket.getInputStream();
		//将目的文件夹封装成File对象
		File file = new File("D:\\Desktop");
		//如果文件夹不存在，则创建
		if(!file.exists()){
			file.mkdirs();
		}
		//为文件名重复，使用公司名+当前时间的毫秒值+6位数随机+后缀
		String imageName = "hancy"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
		//File.separator表示\\
		FileOutputStream fileOutputStream = new FileOutputStream(file+File.separator+imageName);
		//定义字节数组，用于存储接收到的数据
		byte data[] = new byte[1024];

		int length = 0;
		while((length = inputStream.read(data)) != -1){
			fileOutputStream.write(data, 0, length);
		}
		
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("上传成功".getBytes());
		
		fileOutputStream.close();
		outputStream.close();
		inputStream.close();
		socket.close();
		serverSocket.close();
	}
}
