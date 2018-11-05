package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 朱伟
 *
 */
public class DateDemo {
	public static void main(String[] args) throws ParseException {
	/*
	 * 月份由从 0 至 11 的整数表示；0 是一月、1 是二月等等；因此 11 是十二月。 
	 */
		Demo2();
		demo();
		Demo3();
	}
//字符串转日期
	public static void Demo3() throws ParseException {
		String str_date = "2018年11月2日";
DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		Date date = df.parse(str_date);
		System.out.println(date);
	}

	private static void Demo2() {
		long time = System.currentTimeMillis();
//		System.out.println(time);//1541078372824
		
		Date date = new Date();
//		System.out.println(date);//Thu Nov 01 21:20:27 CST 2018
		
		//毫秒转日期
		Date date2 = new Date(1541078372824l);//加个l
//		System.out.println(date2);//Thu Nov 01 21:21:30 CST 2018
		
		//日期转毫
		date2.compareTo(date);
		String str = date.toString();
//		System.out.println(	date.compareTo(date2));
//		System.out.println(	str);
		date.getTime();
	}

	
	//日期对象--日期字符串
	public static void demo() {
		Date  date = new Date();
		System.out.println(date);
		//获取日期格式对象,默认风格
		//DateFormat df = DateFormat.getDateTimeInstance();
		
		//其他风格风格FULL LONG
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(df);//java.text.SimpleDateFormat@535c7d7d
		 String str = df.format(date);
		 System.out.println(str);
		 
		 //自定义风格
		 DateFormat df2 = new SimpleDateFormat("yyyy--MM--dd");
		 String ssr = df2.format(date);
		 System.out.println(ssr);
		
	}
}
