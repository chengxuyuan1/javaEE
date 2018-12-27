package com.jike.Exc;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			tell(10, 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void tell(int i,int j) throws ArithmeticException{
		int temp=0;
		temp=i/j;
		System.out.println(temp);
	}
}
