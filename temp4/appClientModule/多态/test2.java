package 多态;
class A{
	public void tell1() {
	}
	public void tell2() {
		System.out.println("A---tell2");
	}
}
class B extends A{
	public void tell1() {
		System.out.println("B---tell1");
	}
	public void tell3() {
		System.out.println("B---tell3");
	}
}
public class test2 {
	public static void main(String[] args) {
		//向上转型
		B b=new B();
		A a=b;
		a.tell1();//tell1重写的
		a.tell2();
		//向下转型
		System.out.println("");
		A a2=new B();
		B b2=(B)a2;
		b2.tell1();
		b2.tell2();
		b2.tell3();
	}
}
