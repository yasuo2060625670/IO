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
	
	//c.add(year.YEAR, 4);//2020��11��2������һ
	//������
	c.add(Calendar.DAY_OF_MONTH, -1);
	
	
	showDate(c);
}

private static void showDate(Calendar c ) {
	//Calendar c  = Calendar.getInstance();
	int y = c.get(Calendar.YEAR);
	int m = c.get(Calendar.MONTH)+1;//!
	int d = c.get(Calendar.DAY_OF_MONTH);
	String week = getweek(c.get(Calendar.DAY_OF_WEEK));//������㷨
	System.out.println(y+"��"+m+"��"+d+"��"+week);
}

public static String getweek(int i) {
	String str[] = {"","������","����һ","���ڶ�","������","������","������","������",};
	return str[i];
	
}
}
