package 集合;

public class 可变参数 {
	
	public static void main(String[] args) {
		add();
		add(1);
		add(1,57,246,2323,-2354);
	}
	
	/**
	 * 可变参数个数，本质是个数组，用于接收同一数据类型的参数
	 * 注：
	 * 		1.一个方法中只允许一个可变参
	 * 		2.可变参只能放在参数的最后面
	 * @param a
	 * @return
	 */
	public static int add(int...a){
		int c = 0;
		for(int b : a){
			c = c + b;
		}
		System.out.println(c);
		return c;
	}
}
