package 多线程;

public class Demo2_1 {

	public static void main(String[] args) {

		Demo2_2 demo2_2 = new Demo2_2();

		new Thread(demo2_2, "线程1").start();

		
	}
}
