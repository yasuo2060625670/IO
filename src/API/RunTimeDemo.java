package API;

import java.io.IOException;

//import org.omg.SendingContext.RunTime;

/**
 * @author 朱伟
 *
 */
public class RunTimeDemo {
	
	
 public static void main(String[] args) throws IOException, InterruptedException {
	/*
	 * RunTime类里面没有构造方法说明不能被实例化，
	 * 但是方法不都是静态的，说明肯定有一个静态方法可以返回一个Runtime对象
	 * 的引用，使用了单例设计模式*/
	 Runtime r = Runtime.getRuntime();
	
	//r.exec("D:\\CloudMusic\\cloudmusic.exe D:\\1.mp3");
	 
	 Process p =  r.exec("notepad.exe");
	 Thread.sleep(1000);
	 p.destroy();
	 
	 
}
}
