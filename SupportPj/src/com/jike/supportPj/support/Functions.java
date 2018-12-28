
package com.jike.supportPj.support;

public class Functions {
	public static boolean isEmailAdress(String in) {
		if (in.contains("@")&&in.endsWith(".com")) {
			return true;
		}else {
			return false;
		}
	}
}
