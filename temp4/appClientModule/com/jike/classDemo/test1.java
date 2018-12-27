package com.jike.classDemo;

class Person{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=0&&age<150) {
			this.age = age;
		}
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void tell() {
		System.out.println("年龄："+age+" 姓名："+name);
	}
}

public class test1 {
	public static void main(String[] args) {
		Person person=new Person();
		person.setAge(-30);
		person.setName("jj");
		person.tell();
	}
}
