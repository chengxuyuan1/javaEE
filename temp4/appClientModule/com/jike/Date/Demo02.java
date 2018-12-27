package com.jike.Date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class Demo02 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date=new Date(System.currentTimeMillis());
		Calendar calendar=Calendar.getInstance();
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("date:"+date);
		System.out.println("format date:"+simpleDateFormat.format(date));
		
		String time2="1996-09-18 07:18:09";
		SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date2=format2.parse(time2);//将字符串转换成时间
		System.out.println("string转date:"+date2);
		System.out.println("date转string:"+format2.format(date2));
	}

}
