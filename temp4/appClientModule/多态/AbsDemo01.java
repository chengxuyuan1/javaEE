package 多态;

import com.jike.extendsDemo.interfaceDemo;

abstract class Person{
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
	
	public Person(int age , String name){
		this.age=age;
		this.name=name;
	}
	public abstract void want();
}
class Student extends Person{
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Student(int age, String name,int score) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.score=score;
	}

	@Override
	public void want() {
		// TODO Auto-generated method stub
		System.out.println("姓名: "+getName()+"  年龄:"+getAge()+"  分数:"+getScore());
	}
	
}
class Worker extends Person{
	private int money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public Worker(int age, String name,int money) {
		super(age, name);
		// TODO Auto-generated constructor stub
		this.money=money;
	}

	@Override
	public void want() {
		// TODO Auto-generated method stub
		System.out.println("姓名: "+getName()+"  年龄:"+getAge()+"  工资:"+getMoney());
	}
	
}
public class AbsDemo01 {
	public static void main(String[] args) {
		Student student=new Student(10, "张三",60);
		student.want();
		
		Worker worker=new Worker(35,"大明", 10000);
		worker.want();
	}
}
