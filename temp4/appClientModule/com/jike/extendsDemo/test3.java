package com.jike.extendsDemo;
class A{
	public void tell() {
		System.out.println("我是tell方法");
	}
}
class B extends A{
	public void tell() {
		super.tell();
		System.out.println("我重写了tell方法");
	}
}
public class test3 {
	public static void main(String[] args) {
		B b=new B();
		b.tell();
	}
}
