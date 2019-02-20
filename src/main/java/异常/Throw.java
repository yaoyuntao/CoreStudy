package 异常;

public class Throw {

	public static void main(String[] args) throws Exception {
		int[] array1 = {};
		int[] array2 = null;
		test(array1);
		test(array2);
	}
	
	public static void test(int[] array) throws Exception{
		if(array == null){
			throw new Exception("传入的数组为空");
		}
		
		if(array.length == 0){
			throw new Exception("传入的数组长度为0");
		}
		
		int a = array[array.length - 1];
		System.out.println(a);
	}

}
