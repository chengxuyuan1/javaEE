package com.jike.基础知识陷阱;


public class ReturnTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnFunction());
		exitFunction();
	}
	public static boolean returnFunction() {
		try {
			return false;
		} finally {
			return true;
		}
	}
	
	public static void exitFunction() {
		try {
			System.out.println("Hello");
			System.exit(0);
		} finally {
			// TODO: handle finally clause
			System.out.println("GoodBye!");
		}
	}
}
