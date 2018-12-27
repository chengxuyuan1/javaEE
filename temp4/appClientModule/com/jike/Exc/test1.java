package com.jike.Exc;
class Exc{
	int i=10;
}
public class test1 {
	public static void main(String[] args) {
		Exc e=null;
		e= new Exc();
		System.out.println(e.i);
		
		int a=10;
		int b=0;
		int temp=0;
		try {
			 temp=a/b;
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2);
		} finally {
			System.out.println(temp);
			System.out.println("程序退出");
		}
		
	}
	
	
}
