package 多线程;

/**
 * 同步代码块synchronized+同步锁object
 * @author hancy
 * 2017年8月25日
 */
public class Demo4_2 implements Runnable{
	
	private int num = 10;
	private Object object = new Object();
	public void run(){
		while (true) {
			//同步代码块，需传入任意对象，object为所有对象的父类
			//object称为对象锁
			synchronized (object) {
				if(num > 0){
					System.out.println(Thread.currentThread().getName()+":"+num--);
				}
			}
		}
	}
}
