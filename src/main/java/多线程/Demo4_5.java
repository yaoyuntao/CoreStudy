package 多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Lock接口的实现类，代替synchronized
 * 从而避免了synchronized的缺点（代码出现异常catch，不会释放同步锁）
 * @author hancy
 * 2017年8月25日
 */
public class Demo4_5 implements Runnable{
	
	private int num = 10;
							//英文:rui an chun de
	private Lock lock = new ReentrantLock();
	
	public void run(){
		while (true) {
			threadCode();
		}
	}
	

	public void threadCode(){
		//获得锁
		lock.lock();
		
		if(num > 0){
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+num--);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				//释放锁
				lock.unlock();
			}

		}
	}
	

}
