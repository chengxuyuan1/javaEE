package helloFile;
import java.io.File;

public class helloFolder {
	public static void main(String[] args) {
//		File floder=new File("my new folder/one/two");
//		if (floder.mkdir()) {
//			System.out.println("文件夹创建完成");
//		}else {
//			if (floder.exists()) {
//				System.out.println("文件夹已存在");
//			}else {
//				if (floder.mkdirs()) {
//					System.out.println("多级文件夹创建完成");
//				}else {
//					System.out.println("文件夹创建失败");
//				}
//				
//			}
//			
//		}
		
//		File floder=new File("my new folder");
//		File newFloder=new File("new folder name");
//		if (floder.renameTo(newFloder)) {
//			System.out.println("done");
//		}else {
//			System.out.println("fail");
//		}
		
		File floder=new File("new folder name/one/two");//只能删除空文件夹
		if (floder.delete()) {
			System.out.println("done");
		}else {
			System.out.println("fail");
		}
	}
}
