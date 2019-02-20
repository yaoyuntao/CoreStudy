package 多线程;

public class Demo1_1 {
	//所有类都继承object
	public static void main(String[] args) {
		//创建子线程对象，由于Demo1_2类继承了Thread类
		//new Thread()和new Demo1_2()都是创建一个线程
		Demo1_2 demo1_2 = new Demo1_2();
		//子线程改名
		demo1_2.setName("子线程");
		//启动子线程
		demo1_2.start();
		
		try {
			//线程休眠500毫秒
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//主线程继续运行，不用等子线程结束
		System.out.println("main");
		//线程的名称,默认是Thread开头，从0开始
		System.out.println(demo1_2.getName());
		
		//获取当前线程的对象
		Thread.currentThread();
		
	}
}
