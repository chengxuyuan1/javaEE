package control;

import javax.swing.JFrame;

public class DebugTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is a debug info");
		System.out.println(new JFrame(){
			public String tosString() {
				return "this is a jframe";
			}
		});
		
		System.err.println("this is a error info");
	}

}
