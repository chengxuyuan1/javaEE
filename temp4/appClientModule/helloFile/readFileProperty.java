package helloFile;
import java.io.File;

public class readFileProperty {
	public static void main(String[] args) {
		File file=new File("text.txt");
		System.out.println("文件是否存在:"+file.exists());
		System.out.println("文件名称:"+file.getName());
		System.out.println("文件路径:"+file.getPath());
		System.out.println("绝对路径:"+file.getAbsolutePath());
		System.out.println("文件父级路径:"+file.getParent());
		System.out.println("文件文件大小:"+file.length()+"byte");
		System.out.println("文件是否隐藏:"+file.isHidden());
		System.out.println("文件是否可读:"+file.canRead());
		System.out.println("文件是否可写:"+file.canWrite());
		System.out.println("文件是否为文件夹:"+file.isDirectory());
		
	}
}
