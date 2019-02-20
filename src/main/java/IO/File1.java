package IO;

import java.io.File;

/**
 * 文件夹跨平台，分隔符不能写死
 * @author hancy
 * 2017年8月26日
 */
public class File1 {

	public static void main(String[] args) {
		//目录分隔符，类似于环境变量。目录之前的分隔符
		//windows是;linux是:     
		//pathSeparator会跟着系统变化而变化
		String pathSeparator = File.pathSeparator;
		System.out.println(pathSeparator);
		
		//路径分隔符
		//windows是\linux是/
		String separator = File.separator;
		System.out.println(separator);
	}
}
