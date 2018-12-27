package com.jike.classDemo;

class People{
	int age;
	String name;
	public People(int a,String n) {//构造方法,方法名与类名一致
		age=a;
		name=n;
		System.out.println("姓名:"+name+" 年龄:"+age);
	
	}
	public People(int a){
		age=a;
		System.out.println(" 年龄:"+age);
	}
}

public class structMethod {
	public static void main(String[] args) {
		People peple=new People(30,"张三");
		
	}
}
