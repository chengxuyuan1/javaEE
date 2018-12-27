package com.jike.method;

import java.util.Scanner;;

public class test4 {
	static String name;
	static char sex;
	static short age;
	static float height;
	static String type;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		print();
		input();
		print();
	}
	public static void input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("姓名: ");
		name=scanner.next();
		System.out.println("性别: ");
		sex=scanner.next().charAt(0);
		System.out.println("年龄: ");
		age=scanner.nextShort();
		System.out.println("身高: ");
		height=scanner.nextFloat();
		System.out.println("性格: ");
		type=scanner.next();
	}
	public static void print() {
		System.out.print("嗨，大家好，俺叫："+name);
		System.out.print(",今年；"+age+"岁");
		System.out.print(",身高；"+height+"米");
		System.out.print(",性格；"+type+sex+"士");
	}
}
