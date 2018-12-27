package com.jike.extendsDemo;
class Father{
	private String name;
	private int age;
	
	public Father(){
		System.out.println("父类的构造方法");
	}
}
class Son extends Father{
	public Son() {
		System.out.println("子类的构造方法");
	}
}
public class test2 {
	public static void main(String[] args) {
		Son son=new Son();
	}
}
