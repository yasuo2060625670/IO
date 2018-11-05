package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

//两个日期间隔，相减
//毫秒值相减，毫秒需要日期对象，日期对象通过字符串搞。（）parse方法
public class DateTest {
public static void main(String[] args) throws ParseException {
	String date1 = "2018-11-2";
	String date2 = "2017-12-25";
	test(date1,date2);
}

public static void test(String date1, String date2) throws ParseException {
	DateFormat df = DateFormat.getDateInstance();
	//Date d1 = df.parse(date1);//获取日期对象。
	Date d2 = df.parse(date2);//获取日期对象。
	//long time1 = d1.getTime();
	long time2 = d2.getTime();
	
	
	Date d3 = new Date();
//	 String d33 = df.format(d3);
//	Date date3 = df.parse(d33);
	long time3 = d3.getTime();
	long time = Math.abs(time3 - time2);
	long day = getDay(time);
	System.out.println(day);
}

private static long getDay(long time) {
return time/1000/60/60/24;
	
}
}
