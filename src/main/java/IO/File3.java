package IO;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author hancy
 * 2017年8月26日
 */
public class File3 {

	public static void main(String[] args) throws IOException {
		getName();
		getLength();
		getAbsolutePath();
		getParentFile();
		getExists();
		getIsDirectory();
		getListFiles();
		System.out.println("---------");
		File file = new File("D:\\Music");
		getAllListFiles(file);
	}
	
	/**
	 * 输出路径的最后一段，可以是文件或文件夹
	 */
	public static void getName(){
		File file = new File("D:\\Software");
		System.out.println(file.getName());
	}
	
	/**
	 * 获取文件的字节数，返回值是long
	 */
	public static void getLength(){
		File file = new File("D:\\Music\\虾米音乐\\以冬-我的一个道姑朋友.mp3");
		System.out.println(file.length());
	}
	
	/**
	 * 获取文件的绝对路径
	 * 代码中的相对路径是工程路径
	 * getAbsoluteFile返回File对象
	 * getAbsolutePath返回String类型
	 */
	public static void getAbsolutePath(){
		File file = new File("123");
		System.out.println(file.getAbsoluteFile());
	}
	
	/**
	 * 获取文件的父路径（上一级路径）
	 * 返回值是File对象
	 * getParentPath()	返回string
	 */
	public static void getParentFile(){
		File file = new File("D:\\Music\\虾米音乐\\以冬-我的一个道姑朋友.mp3");
		System.out.println(file.getParentFile());
		System.out.println(file.getParentFile().getParentFile());
		System.out.println(file.getParentFile().getParentFile().getParentFile());
	}
	
	/**
	 * 判断文件或文件夹存不存在
	 */
	public static void getExists(){
		File file = new File("D:\\Music\\虾米音乐\\以冬-我的一个道姑朋友.mp3");
		System.out.println(file.exists());
	}
	
	/**
	 * 判断是不是文件夹
	 */
	public static void getIsDirectory(){
		File file = new File("D:\\Music\\虾米音乐\\以冬-我的一个道姑朋友.mp3");
		System.out.println(file.isDirectory());
	}
	
	/**
	 * 获取文件夹中的文件或文件夹
	 * 返回值是File对象
	 * list()	返回string
	 */
	public static void getListFiles(){
		File file = new File("D:\\Music\\虾米音乐");
		File[] files = file.listFiles(new FileUtil());
		for(File file2 : files){
			System.out.println(file2);
		}
	}
	
	/**
	 * 获取文件夹中的所有文件或文件夹(含各级子文件夹中的文件)
	 * 方法调用自己，称为递归
	 * 注意：
	 * 		1.不要无限循环调用，否则会造成栈内存溢出
	 * 		2.不能使用构造递归
	 */
	public static void getAllListFiles(File file){
		File[] files = file.listFiles();
		for(File file2 : files){
			if(file2.isDirectory()){
				getAllListFiles(file2);
			}else{
				System.out.println(file2);
			}
		}
	}
	
}
