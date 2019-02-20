package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP发送端，可编写聊天程序
 * @author hancy
 * 2017年8月15日
 */
public class Demo2_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//字节数组
		byte[] data = "你好UDP".getBytes();
		//获取本地主机对象
		InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
		//往inetAddress这个主机对象的6000端口，发送长度为data.length的数据data
		DatagramPacket packet = new DatagramPacket(data, data.length, inetAddress, 6001);
		
		DatagramSocket socket = new DatagramSocket();
		socket.send(packet);
		socket.close();
	}

}
