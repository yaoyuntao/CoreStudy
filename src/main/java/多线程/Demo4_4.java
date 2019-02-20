package 多线程;

/**
 * 同步方法synchronized修饰符+同步锁this(当前类的引用)
 * @author hancy
 * 2017年8月25日
 */
public class Demo4_4 implements Runnable{
	
	private int num = 10;

	public void run(){
		while (true) {
			threadCode();
		}
	}
	
	//同步方法，不需要创建对象object
	//同步方法也有对象锁，是本类对象的引用this
	//静态同步方法的锁是本类.class。因为静态方法不能用this和super
	public synchronized void threadCode(){
		if(num > 0){
			System.out.println(Thread.currentThread().getName()+":"+num--);
		}
	}
	
	//例如StringBuffer和StringBuilder提供的功能都是一样的
	//StringBuffer		里面的方法都是同步方法。执行慢
	//StringBuilder		里面的方法都是普通方法。执行块
}
