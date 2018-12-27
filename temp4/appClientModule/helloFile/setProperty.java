package helloFile;

import java.io.File;

public class setProperty {
	public static void main(String[] args) {
		File file=new File("test.file");
		if (file.exists()) {
			//文件设置为可写
			file.setWritable(true);
			//读权限
			file.setReadable(true);
			//只读
			file.setReadOnly();
			
		}
	}
}
