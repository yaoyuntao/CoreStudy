package IO;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件过滤器
 * 当File对象调用listFile方法时，自动调用FileUtil类的accept方法
 * 把后缀为.mp3的文件放入File数组
 * @author hancy
 * 2017年8月26日
 */
public class FileUtil implements FileFilter{

	public boolean accept(File pathname) {
		return pathname.getAbsolutePath().endsWith(".mp3");
	}

}
