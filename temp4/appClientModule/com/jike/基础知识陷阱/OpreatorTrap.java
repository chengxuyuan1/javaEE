package com.jike.基础知识陷阱;

import 多态.interDemo01;

public class OpreatorTrap {
	public static void main(String[] args) {
		int j=0;
		for (int i = 0; i < 100; i++) {
			j=j++;
		}
		System.out.println(j);//结果是0
	}
}
