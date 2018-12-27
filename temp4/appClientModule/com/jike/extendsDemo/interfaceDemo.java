package com.jike.extendsDemo;
interface Inter{
	public static final int AGE=100;//全局常量
	public abstract void tell();//抽象方法
}
interface inter2{
	public abstract void say();
}
abstract class Abs1{
	public abstract void print();
}
interface Inter3 extends Inter,inter2{//接口可以多继承接口
	
}
class N extends  Abs1 implements Inter,inter2 {//接口可以多实现

	@Override
	public void tell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void say() {
	// TODO Auto-generated method stub
	
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N a=new N();
		a.tell();
		System.out.println(a.AGE);
		System.out.println(Inter.AGE);
		a.say();
		
	}

}
