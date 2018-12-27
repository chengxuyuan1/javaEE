package com.jike.extendsDemo;
class People2{//final修饰的类不能被继承
	public final void tell() {//final修饰的方法不能被重写
		
	}
}
class student extends People2{
	
}
public class finalTest {
	public static void main(String[] args) {
		final String name="jike";//final修饰的属性不能被修改
	}
}
