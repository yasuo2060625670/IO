package API;

import java.util.Random;

/**
 * @author 朱伟
 *
 */
public class MathDemo {
public static void main(String[] args) {
	
	/*
	 * 常用方法
	 * 1、ceil, round,floor
	 * 2、abs
	 * 3、
	 */
	int a = -4;
	System.out.println(Math.abs(a));//绝对值
	
	double b = 12.56;
//	sop(Math.ceil(b));//大于b的最小整数
//	sop(Math.round(b));//最近整数
//	sop(Math.floor(b));//小于b的最大整数
	
	Random r = new Random();
	for (int i = 0; i < 10; i++) {
		double  s = Math.random();//0到1伪随机数
		double  ss = Math.ceil(Math.random()*10);//1到10
		int  sss = (int)(Math.random()*10);//1到10
		double ssss = r.nextDouble();
		int ssr = r.nextInt(11);
		System.out.println(ssr);
		
	}
	
}

public static void sop(double a) {
	// TODO Auto-generated method stub
	System.out.println( a);
}
}
