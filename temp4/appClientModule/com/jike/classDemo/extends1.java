package com.jike.classDemo;
class person3{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void tell() {
		System.out.println("姓名:"+name+"  年龄:"+age);
	}
}
class student1 extends person3{
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void say() {
		System.out.println("姓名:"+getName()+"  年龄:"+getAge()+"成绩:"+getScore());

	}
}
public class extends1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 student=new student1();
		student.setAge(10);
		student.setName("张三");
		student.setScore(100);
		student.say();
	}

}
