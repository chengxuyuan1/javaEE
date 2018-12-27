package 泛型;

import com.jike.extendsDemo.interfaceDemo;

class Point<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}

	
}
public class genericDemo01 {
	public static void main(String[] args) {
		Point<String> point=new Point<String>();
		point.setX("精度:109");
		point.setY("维度:100");
		System.out.println(point.getX()+"  "+point.getY());
		
		Point<Integer> point2=new Point<Integer>();
		point2.setX(10);
		point2.setY(100);
		System.out.println(point2.getX()+"  "+point2.getY());
	}
}
