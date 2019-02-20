package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress类对象的创建及常用方法
 * @author hancy
 * 2017年8月15日
 */
public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		//使用了单例设计模式创建对象，创建本地主机对象。尽量不要用此方法，获取本机可以byName-127.0.0.1
		InetAddress inetAddress1 = InetAddress.getLocalHost();
		
		//输出主机名
		System.out.println(inetAddress1.getHostName());
		//输出主机IP
		System.out.println(inetAddress1.getHostAddress());
		
		//可以根据主机名（域名）获取对方主机对象
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress2);
		
		InetAddress inetAddress3 = InetAddress.getByName("hancy-PC");
		System.out.println(inetAddress3);
	}
}
