package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * UDP接收端
 * @author hancy
 * 2017年8月15日
 */
public class Demo2_2 {

	public static void main(String[] args) throws IOException {
		//每次UDP传输最大为64K
		byte[] data = new byte[1024*64];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		DatagramSocket socket = new DatagramSocket(6001);
		socket.receive(packet);
		//获取发送端的ip
		String address = packet.getAddress().getHostAddress();
		//获取发送端的端口
		int port = packet.getPort();
		//获取接收的数据包的长度
		int length = packet.getLength();
		//转换成字符串类型输出
		System.out.println(new String(data, 0, length));
		System.out.println(address);
		System.out.println(port);
		socket.close();
	}
}
