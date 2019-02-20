package 多线程;

/**
 * 匿名内部类实现多线程
 * @author hancy
 * 2017年8月19日
 */
public class Demo3 {

	public static void main(String[] args) {
		//第一种
		new Thread(){
			public void run(){
				System.out.println("匿名内部类");
			}
		}.start();
		
		//第二种
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("匿名内部类");
			}
		};
		new Thread(runnable).start();
		
		//第三种
		new Thread(
			new Runnable() {
				public void run() {
					System.out.println("匿名内部类");
				}
			}
		).start();
	}
}
