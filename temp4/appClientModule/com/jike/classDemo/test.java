package com.jike.classDemo;
class People2{
	public void tell() {
		System.out.println(this);
		
	
	}
}
class Person2{
	String name;
	static String country="北京";
	public Person2(String name){
		this.name=name;
	}
	public static void setCountry(String country) {
		Person2.country = country;
	}
	public static String getCountry() {
		return country;
	}
	public void tell() {
		System.out.println("姓名:"+name+"  出生地:"+country);
	}
}
public class test {
	public static void main(String[] args) {
		People2 people2=new People2();
		people2.tell();
		
		Person2  person2=new Person2("张三");
		//静态属性用类名调用，静态方法也用类名调用,静态方法不能调用非静态方法和非静态属性
		Person2.country="上海";
		person2.tell();
		
		Person2  person3=new Person2("张三");
		//person3.country="上海";
		person3.tell();
	}
}
