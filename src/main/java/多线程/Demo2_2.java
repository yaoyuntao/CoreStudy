package 多线程;

/**
 * 好处：
 * 		1.线程和执行的代码不在一个类，降低了耦合性
 * 		2.资源共享
 * @author hancy
 * 2017年8月19日
 */
public class Demo2_2 implements Runnable{

	public void run(){
		System.out.println("run"+"  "+Thread.currentThread().getName());
	}
}
