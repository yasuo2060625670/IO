package API;

import java.util.Calendar;

public class CalendarDemo {
public static void main(String[] args) {
//	demo_1();
	Calendar c  = Calendar.getInstance();
	int year = c.get(Calendar.YEAR);

	showDate(c);
	showDays(year);
	showLastDay();
}

private static void showLastDay() {
	// TODO Auto-generated method stub
	Calendar c  = Calendar.getInstance();
//	int y = c.get(Calendar.YEAR);
//	int m = c.get(Calendar.MONTH)+1;//!
//	int d = c.get(Calendar.DAY_OF_MONTH);
	c.add(Calendar.DAY_OF_MONTH, -1);
	c.getTime();
	System.out.println(c.getTime());
	showDate(c);
}

private static void showDays(int year) {
	Calendar c  = Calendar.getInstance();
	
	c.set(year, 2, 1);
	
	//c.add(year.YEAR, 4);//2020年11月2日星期一
	//连续的
	c.add(Calendar.DAY_OF_MONTH, -1);
	
	
	showDate(c);
}

private static void showDate(Calendar c ) {
	//Calendar c  = Calendar.getInstance();
	int y = c.get(Calendar.YEAR);
	int m = c.get(Calendar.MONTH)+1;//!
	int d = c.get(Calendar.DAY_OF_MONTH);
	String week = getweek(c.get(Calendar.DAY_OF_WEEK));//老外的算法
	System.out.println(y+"年"+m+"月"+d+"日"+week);
}

public static String getweek(int i) {
	String str[] = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
	return str[i];
	
}
}
