package com.jike.Exc;
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("自定义异常");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
