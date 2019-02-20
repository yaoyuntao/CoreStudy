package 多线程;

/**
 * 起多个线程测试
 * @author hancy
 * 2017年8月25日
 */
public class Demo4_1 {

	public static void main(String[] args) {
		Demo4_2 demo4_2 = new Demo4_2();
		
		new Thread(demo4_2).start();
		new Thread(demo4_2).start();
		new Thread(demo4_2).start();
		
	}
}
