package 泛型;
class Con<T>{
	private T valueT;

	public T getValueT() {
		return valueT;
	}

	public void setValueT(T valueT) {
		this.valueT = valueT;
	}
	public Con(T valueT) {
		// TODO Auto-generated constructor stub
		this.valueT=valueT;
	}
}
public class genericDemo02 {
	public static void main(String[] args) {
		Con<String> con=new Con<String>("构造方法中使用泛型");
		System.out.println(con.getValueT());
	}
}
