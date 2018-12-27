package com.jike.classDemo;
class Ref1{
	int temp=10;
}
class People1{
	private String name;
	private int age;
	public People1(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	public People1() {
		System.out.println("无参构造方法");
	}
	public void tell() {
		System.out.println("姓名:"+getName()+" 年龄:"+getAge());
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
public class RefTest {
	public static void main(String[] args) {
		Ref1 ref1=new Ref1();
		tell(ref1);
		System.out.println(ref1.temp);
		
		String tempString="hello";
		System.out.println(tempString);
		tell2(tempString);
		System.out.println(tempString);
		
		People1 people=new People1("张三", 30);
		people.tell();
	}
	public static void tell(Ref1 r2) {
		r2.temp=30;
	}
	public static void tell2(String str) {
		str="jike";
	}
}
