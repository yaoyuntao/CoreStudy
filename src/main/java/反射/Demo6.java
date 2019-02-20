package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 擦除泛型
 * 正常情况下String类型的集合，只能存储String类型的元素
 * 由于类文件对象是没有泛型的，所以可以通过类文件对象获取add方法，插入任意类型的数据
 * @author hancy
 * 2017年8月15日
 */
public class Demo6 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		List<String> list = new ArrayList<String>();
		Class class1 = list.getClass();
		Method method = class1.getMethod("add", Object.class);
		method.invoke(list, 1);
		method.invoke(list, 10);
		method.invoke(list, 100);
		System.out.println(list);
		
	}
}
