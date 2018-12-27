package com.jike.Date;

import java.sql.Date;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long now=System.currentTimeMillis();
		System.out.println("now："+now);
		Date date=new Date(now);
		System.out.println("date:"+date);
		Calendar calendar=Calendar.getInstance();
		System.out.print("calendar:"+calendar.getTime().toString());
	}

}
