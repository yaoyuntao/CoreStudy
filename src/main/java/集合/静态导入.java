package 集合;
/**
 * 静态导入，是在import后面加上static
 * 注意：
 * 		导入的必须是静态方法
 * 		静态方法可直接在代码中使用
 */
import static java.lang.System.out;
import static java.util.Arrays.sort;

import java.util.Arrays;
public class 静态导入 {
	public static void main(String[] args) {
		int[] a = {2,1,6,20,3,2,56,4};
		//sort是数组排序的方法
		sort(a);
		
		Arrays.sort(a);
		for(int b : a){
			out.print(b+" ");
		}
	}
}
