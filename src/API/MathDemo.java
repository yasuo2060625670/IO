package API;

import java.util.Random;

/**
 * @author ��ΰ
 *
 */
public class MathDemo {
public static void main(String[] args) {
	
	/*
	 * ���÷���
	 * 1��ceil, round,floor
	 * 2��abs
	 * 3��
	 */
	int a = -4;
	System.out.println(Math.abs(a));//����ֵ
	
	double b = 12.56;
//	sop(Math.ceil(b));//����b����С����
//	sop(Math.round(b));//�������
//	sop(Math.floor(b));//С��b���������
	
	Random r = new Random();
	for (int i = 0; i < 10; i++) {
		double  s = Math.random();//0��1α�����
		double  ss = Math.ceil(Math.random()*10);//1��10
		int  sss = (int)(Math.random()*10);//1��10
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
