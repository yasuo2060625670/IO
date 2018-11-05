package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ��ΰ
 *
 */
public class DateDemo {
	public static void main(String[] args) throws ParseException {
	/*
	 * �·��ɴ� 0 �� 11 ��������ʾ��0 ��һ�¡�1 �Ƕ��µȵȣ���� 11 ��ʮ���¡� 
	 */
		Demo2();
		demo();
		Demo3();
	}
//�ַ���ת����
	public static void Demo3() throws ParseException {
		String str_date = "2018��11��2��";
DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		Date date = df.parse(str_date);
		System.out.println(date);
	}

	private static void Demo2() {
		long time = System.currentTimeMillis();
//		System.out.println(time);//1541078372824
		
		Date date = new Date();
//		System.out.println(date);//Thu Nov 01 21:20:27 CST 2018
		
		//����ת����
		Date date2 = new Date(1541078372824l);//�Ӹ�l
//		System.out.println(date2);//Thu Nov 01 21:21:30 CST 2018
		
		//����ת��
		date2.compareTo(date);
		String str = date.toString();
//		System.out.println(	date.compareTo(date2));
//		System.out.println(	str);
		date.getTime();
	}

	
	//���ڶ���--�����ַ���
	public static void demo() {
		Date  date = new Date();
		System.out.println(date);
		//��ȡ���ڸ�ʽ����,Ĭ�Ϸ��
		//DateFormat df = DateFormat.getDateTimeInstance();
		
		//���������FULL LONG
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(df);//java.text.SimpleDateFormat@535c7d7d
		 String str = df.format(date);
		 System.out.println(str);
		 
		 //�Զ�����
		 DateFormat df2 = new SimpleDateFormat("yyyy--MM--dd");
		 String ssr = df2.format(date);
		 System.out.println(ssr);
		
	}
}
