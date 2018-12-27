package 泛型;
class Info<T>{
	private T key;
	public void setKey(T key) {
		this.key = key;
	}
	public T getKey() {
		return key;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getKey().toString();
	}
}
public class genericDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info<String> info=new Info<String>();
		info.setKey("jike");
		tell(info);
	}
	public static void tell(Info<?> i) {//？通配符
		System.out.println(i);
	}
}
