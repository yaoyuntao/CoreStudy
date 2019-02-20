package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射调用类的成员方法
 * @author hancy
 * 2017年8月15日
 */
public class Demo5 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("反射.Students");
		Students students = (Students) class1.newInstance();
		//获取一个无参的成员方法
		Method method1 = class1.getMethod("study");
		//执行一个无参的成员方法
		method1.invoke(students);
		
		//获取一个有参的成员方法
		Method method2 = class1.getMethod("speak", String.class, int.class);
		//执行一个有参的成员方法
		method2.invoke(students, "张三", 18);
		
	}
}
