package 泛型;
class Gener{
	public <T>T tell(T t) {
		return t;
	}
}
public class genericDemo06 {
	public static void main(String[] args) {
		Gener gener=new Gener();
		System.out.println(gener.tell("jike"));
		System.out.println(gener.tell(10));
	}
}
