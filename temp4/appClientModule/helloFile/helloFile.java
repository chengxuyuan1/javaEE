package helloFile;

import java.io.File;
import java.io.IOException;



public class helloFile {
	public static void main(String[] args) throws IOException {
		File file=new File("hello.txt");
		//是否存在
		if (file.exists()) {
			System.out.println(file.isFile());//是否是文件
			System.out.println(file.isDirectory());//是否是路径
//			file.delete();
//			System.out.println("文件删除成功!");
			File nametoFile=new File("new hello.txt");
			file.renameTo(nametoFile);
		}else {
			System.out.println("文件不存在");
			try {
				file.createNewFile();
				System.out.println("文件创建成功!");
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("文件无法创建");
			}
			
		}
		
	}
}
