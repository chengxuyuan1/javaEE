package helloFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
public class readWriteFile {
	public static void main(String[] args) {
		File file=new File("text.txt");
		if (file.exists()) {
			System.out.println("exists");
			try {
				FileInputStream fileInputStream=new FileInputStream(file);
				InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream, "UTF-8");
				BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
				String line;
				while((line=bufferedReader.readLine())!=null) {
					System.out.println(line);
				}
				bufferedReader.close();
				inputStreamReader.close();
				fileInputStream.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		try {
			File newFile=new File("newtext.txt");
			FileOutputStream fileOutputStream;
			fileOutputStream = new FileOutputStream(newFile);
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"UTF-8");
			BufferedWriter bufferedWriter=new BufferedWriter(outputStreamWriter);
			
			bufferedWriter.write("dddd\n");
			bufferedWriter.write("dddddfffd\n");
			bufferedWriter.write("dgrddffd\n");
			bufferedWriter.write("ddggdd\n");
			bufferedWriter.write("ddrrrrdd\n");
			
			bufferedWriter.close();
			outputStreamWriter.close();
			fileOutputStream.close();
			System.out.println("写入完成");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
		
		
		
	}
}
