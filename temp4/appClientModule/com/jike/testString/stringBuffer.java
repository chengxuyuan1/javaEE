package com.jike.testString;

public class stringBuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("jikexueyuan");
		tell(sb);
		sb.insert(0, "kkkkk");
		sb.replace(1, 4, "wwtliu");
		System.out.println(sb.toString());
	}
	public static void tell(StringBuffer s) {
		s.append(" i love jike");
	}
}
