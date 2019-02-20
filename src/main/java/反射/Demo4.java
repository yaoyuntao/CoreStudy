package 反射;

import java.lang.reflect.Field;

/**
 * 通过反射获取类的成员变量并赋值
 * @author hancy
 * 2017年8月15日
 */
public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class class1 = Class.forName("反射.Students");
		Students students = (Students) class1.newInstance();
		//成员变量需要public修饰，才能获取
		Field field1 = class1.getField("name");
		field1.set(students, "张三");
		System.out.println(students.name);
	}
}
