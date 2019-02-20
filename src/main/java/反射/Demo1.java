package 反射;

/**
 * 获取一个类class文件对象的三种方式
 * 1.对象获取
 * 2.类名获取
 * 3.Class类的静态方法获取
 * @author hancy
 * 2017年8月15日
 */
public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//对象获取
		Students students = new Students();
		Class class1 = students.getClass();
		System.out.println(class1);
		
		//类名获取
		//每个类型(基本和引用)都会被赋予一个静态的属性class
		Class class2 = Students.class;
		System.out.println(class1);
		
		//Class类的静态方法获取
		//包名.类名
		Class class3 = Class.forName("反射.Students");
		System.out.println(class3);
	
		
		//引用类型使用==比较的是对象的内存地址
		//class对象在堆内存中是唯一的
		System.out.println(class1 == class2);		//true
		System.out.println(class1.equals(class2));			//true
	}

}
