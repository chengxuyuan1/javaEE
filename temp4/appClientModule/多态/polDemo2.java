package 多态;
class A1{
	public void tell1() {
		System.out.println("A---tell1");
	}
}
class B1 extends A1{
	public void tell2() {
		System.out.println("B---tell2");
	}
}
class C1 extends A1{
	public void tell3() {
		System.out.println("C---tell3");
	}
}
class D1 extends A1{
	
}
public class polDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		say(new B1());
		say(new C1());
		say(new D1());
	}
	public static void say(A1 a) {
		a.tell1();
	}
	//重载方法名相同，参数不同，同一个类中
//	public static void say(B1 b) {
//		b.tell1();
//	}
//	public static void say(C1 c) {
//		c.tell1();
//	}
}
