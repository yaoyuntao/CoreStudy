package 多线程;

/**
 * 在函数里使用同步代码块，并调用函数
 * 同步代码块synchronized+同步锁object
 * @author hancy
 * 2017年8月25日
 */
public class Demo4_3 implements Runnable{
	
	private int num = 10;
//	private Object object = new Object();
	public void run(){
		threadCode();
	}
	
	public void threadCode(){
		while (true) {
//			synchronized (object) {
			synchronized (this) {
				if(num > 0){
					System.out.println(Thread.currentThread().getName()+":"+num--);
				}
			}
		}
	}
}
