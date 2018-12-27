package com.jike.method;

class Person{
	String name;
	int age;
	public void tell() {
		System.out.println("姓名:"+name+"，年龄"+age);
	}
}

public class classTest {
	public static void main(String[] args) {
		Person person=null;
		person=new Person();
		person.name="张三";
		person.age=10;
		person.tell();
	}
}
