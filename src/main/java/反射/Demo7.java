package 反射;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 把类名和方法名抽离到配置文件中
 * @author hancy
 * 2017年8月15日
 */
public class Demo7 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, IOException {
		Properties properties = new Properties();
		Reader reader = new FileReader("反射.properties");
		properties.load(reader);
		
		String className = properties.getProperty("className");
		String methodName = properties.getProperty("methodName");
		
		Class class1 = Class.forName(className);
		Object object = class1.newInstance();
		Method method = class1.getMethod(methodName);
		method.invoke(object);
		
	}
}
