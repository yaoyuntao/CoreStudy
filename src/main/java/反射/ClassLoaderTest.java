package 反射;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		//获得Demo字节码文件的类加载器
		Class clazz = ClassLoaderTest.class;//获得Demo的字节码对象
		ClassLoader classLoader = clazz.getClassLoader();//获得类加载器
		//getResource的参数路径相对classes（src）
		//获得classes(src)下的任何的资源
		String path = classLoader.getResource("反射.properties").getPath();
		//classLoader.getResourceAsStream("");
		//getResourceAsStream()  相当于根据文件的绝对路径获得输入流
		System.out.println(path);
		
	
		
	}
	
}
