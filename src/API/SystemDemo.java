package API;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {
public static void main(String[] args) {
	long l1 = System.currentTimeMillis();
//	System.out.println("haha\r\nworld");
//	System.out.println("haha"+System.getProperty("java.version")+"world");
//	System.setProperty("mykey", "myvale");
//	System.out.println(l1/1000/60/60/24);
	
	Properties prop = System.getProperties();
	System.out.println(prop.getProperty("java.version", "null"));
//	Set<String> set  = prop.stringPropertyNames();
//	for (String key : set) {
//		String value = prop.getProperty(key);
//		System.out.println(key+":"+value);
//		
//	}
	
}
}
