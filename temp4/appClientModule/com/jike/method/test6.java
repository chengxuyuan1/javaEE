package com.jike.method;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pround(3.14159, 2));
	}
	public static double pround(double value,int index) {
		double pow10=Math.pow(10, index);
		double result=value*pow10;
		result=Math.round(result);
		result/=pow10;
		return result;
	}
}
