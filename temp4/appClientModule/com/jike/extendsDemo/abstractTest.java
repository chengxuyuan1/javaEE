package com.jike.extendsDemo;


abstract class Abs{
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void tell() {
		
	}
	public abstract void say();
	public abstract void print();
}
class AbsDemo extends Abs{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println(this.getAge());
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
public class abstractTest {
	public static void main(String[] args) {
		//Abs abs=new Abs();抽象类不能被直接实例化
		AbsDemo absDemo=new AbsDemo();
		absDemo.setAge(20);
		absDemo.say();
		absDemo.print();
	}
}
