package 多态;
class A2{
	public void tell1() {
		System.out.println("A---tell1");
	}
	public void tell2() {
		System.out.println("A---tell2");
	}
}
class B2 extends A2{
	public void tell1() {
		System.out.println("B---tell1");
	}
	public void tell3() {
		System.out.println("B---tell3");
	}
}
public class test1 {
	public static void main(String[] args) {
		A2 a2=new A2();
		System.out.println(a2 instanceof A2);//判断a2是否A2的实例
		System.out.println(a2 instanceof B2);
		
		A2 a1=new B2();
		System.out.println(a1 instanceof A2);
		System.out.println(a1 instanceof B2);
	}
}
