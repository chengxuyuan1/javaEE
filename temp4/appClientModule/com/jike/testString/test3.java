package com.jike.testString;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  jikexueyuan@qq.com";
		System.out.println(str.length());
		char data[]=str.toCharArray();
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+"  ");
		}
		System.out.println();
		System.out.println(str.charAt(7));
		byte bytes[]=str.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i]+"  ");
		}
		System.out.println();
		System.out.println(str.indexOf("@"));//包含
		System.out.println(str.trim());//去掉空格
	}

}
