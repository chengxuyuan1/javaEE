package 泛型;
class Gen<T,K>{
	private T take;
	private K key;
	public T getTake() {
		return take;
	}
	public void setTake(T take) {
		this.take = take;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
}
public class genericDemo03 {
	public static void main(String[] args) {
		Gen<String,Integer>  gen=new Gen<String,Integer>(); 
		gen.setTake("take");
		gen.setKey(10);
		System.out.println(gen.getTake()+"  "+gen.getKey());
	}
}
