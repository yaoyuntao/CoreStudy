package 反射;

import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射获取类文件对象，通过调用无参构造快速获取类对象
 * @author hancy
 * 2017年8月15日
 */
public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1 = Class.forName("反射.Students");
		//不能快速调用有参的构造
		Students students = (Students) class1.newInstance();
		students.study();
	}
}
