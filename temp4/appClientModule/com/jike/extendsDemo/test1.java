package com.jike.extendsDemo;
class People{
	 int age;
	 private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Worker extends People{
	
}
class PetWoker extends Worker{
	public void tell() {
		System.out.println(age+"  "+getName());
	}
}
public class test1 {
	public static void main(String[] args) {
		PetWoker petWoker=new PetWoker();
		petWoker.setName("张三");
		petWoker.age=10;
		petWoker.tell();
	}
}
