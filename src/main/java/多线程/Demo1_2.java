package 多线程;

public class Demo1_2 extends Thread{

	public void run(){
		System.out.println("run");
		System.out.println(getName());
	}
}
