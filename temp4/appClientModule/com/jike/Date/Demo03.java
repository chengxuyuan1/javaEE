package com.jike.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class Demo03 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String birthdayString="2015-05-30";
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=simpleDateFormat.parse(birthdayString);
		
		Date spec=prepareBirthday(date);
		String s2=simpleDateFormat.format(spec);
		System.out.println(birthdayString+"提前两周的周六为:"+s2);
	}
	public static Date prepareBirthday(Date date) {
		Calendar calendar=new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.WEEK_OF_MONTH, -2);//提前2周
		calendar.set(calendar.DAY_OF_WEEK, calendar.SATURDAY);//设置为周六
		return calendar.getTime();
	}
}
