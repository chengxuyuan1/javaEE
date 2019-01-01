package com.jike.基础知识陷阱;

import java.math.BigDecimal;

public class FloatTrap {
	public static void main(String[] args) {
		System.out.println(2.0-1.1);
		BigDecimal bigDecimal=new BigDecimal(Double.toString(2.0));
		BigDecimal bigDecimal2=new BigDecimal(Double.toString(1.1));
		System.out.println(bigDecimal.subtract(bigDecimal2).doubleValue());
	}
}
