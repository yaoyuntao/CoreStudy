package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取类文件对象，并获取调用公共(public)的构造方法，最终获取类对象
 * @author hancy
 * 2017年8月15日
 */
public class Demo2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("反射.Students");
		//获取无参构造
		Constructor<Students> constructor1 = class1.getConstructor();
		//执行无参构造
		Students students1 = constructor1.newInstance();
		students1.study();
		
		//获取有参构造，参数为类型的类文件对象
		Constructor<Students> constructor2 = class1.getConstructor(String.class, int.class);
		//执行有参构造，参数为实际参数
		Students students2 = constructor2.newInstance("张三", 18);
		System.out.println(students2.name);
	}
}
