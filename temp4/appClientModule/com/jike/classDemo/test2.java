package com.jike.classDemo;
class Student{
	public void tell() {
		System.out.println("hello jike");
	}
}
public class test2 {
	public static void main(String[] args) {
		Student student=new Student();
		student.tell();
		new Student().tell();//匿名对象
	}
}
