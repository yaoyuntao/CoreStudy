package API;

public class 正则表达式 {
	
	public static void main(String[] args) {
		cutting();
		replace();
	}
	
	/**
	 * matches()方法，字符串匹配正则表达式
	 */
	public static void matching(){
		String qq = "123456";
		
		boolean a = qq.matches("[1-9][\\d]{5,11}");
		
		System.out.println(a);
	}
	
	/**
	 * 切割字符串也可使用正则表达式
	 * 空格和加号表示一个或多个空格
	 */
	public static void cutting(){
		String num = "12   34 35    3546   24";
		String[] a = num.split(" +");
		for(String s : a){
			System.out.println(s);
		}
	}
	
	/**
	 * 使用正则表达式匹配，替换字符串中的某些字符
	 */
	public static void replace(){
		String s = "dgrh346fgt34654";
		s = s.replaceAll("[\\d]", "#");
		System.out.println(s);
	}
}
