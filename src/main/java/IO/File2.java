package IO;

import java.io.File;
import java.io.IOException;

/**
 * File创建文件和文件夹
 * @author hancy
 * 2017年8月26日
 */
public class File2 {

	public static void main(String[] args) throws IOException {
		System.out.println(createFile());
//		System.out.println(createDir());
//		System.out.println(createDirs());
	}
	
	/**
	 * 如果需创建的文件或文件夹已存在，则返回false
	 * @return
	 * @throws IOException
	 */
	public static boolean createFile() throws IOException{
		File file = new File("D:\\a.txt");
		return file.createNewFile();
	}
	
	public static boolean createDir() throws IOException{
		File file = new File("D:\\a");
		return file.mkdir();
	}
	
	/**
	 * 创建多级文件夹
	 * @return
	 * @throws IOException
	 */
	public static boolean createDirs() throws IOException{
		File file = new File("D:\\b\\c\\d");
		return file.mkdirs();
	}
	
	/**
	 * 可删除文件或文件夹。直接从硬盘中删除，不走回收站
	 * @return
	 */
	public static boolean delete(){
		File file = new File("D:\\a.txt");
		return file.delete();
	}
}
