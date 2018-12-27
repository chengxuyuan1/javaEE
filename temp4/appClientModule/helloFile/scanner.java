package helloFile;
import java.io.File;

import com.jike.extendsDemo.interfaceDemo;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFiles(new File("../temp4"),1);
	}
	public static void printFiles(File dir,int tab) {
		if (dir.isDirectory()) {
			File next[]=dir.listFiles();
			for (int i = 0; i < next.length; i++) {
				
				for (int j = 0; j < tab; j++) {
					System.out.println("|--");
				}
				
				System.out.println(next[i].getName());
				if (next[i].isDirectory()) {
					printFiles(next[i],tab+1);
				}
			}
		}
	}
}
