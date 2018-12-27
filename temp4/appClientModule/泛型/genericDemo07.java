package 泛型;

public class genericDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"www","jike","com"};
		tell(arr);
	}
	public static<T> void tell(T arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
