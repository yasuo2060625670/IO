package API;

import java.io.IOException;

//import org.omg.SendingContext.RunTime;

/**
 * @author ��ΰ
 *
 */
public class RunTimeDemo {
	
	
 public static void main(String[] args) throws IOException, InterruptedException {
	/*
	 * RunTime������û�й��췽��˵�����ܱ�ʵ������
	 * ���Ƿ��������Ǿ�̬�ģ�˵���϶���һ����̬�������Է���һ��Runtime����
	 * �����ã�ʹ���˵������ģʽ*/
	 Runtime r = Runtime.getRuntime();
	
	//r.exec("D:\\CloudMusic\\cloudmusic.exe D:\\1.mp3");
	 
	 Process p =  r.exec("notepad.exe");
	 Thread.sleep(1000);
	 p.destroy();
	 
	 
}
}
