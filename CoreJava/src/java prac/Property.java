import java.util.*;
import java.io.*;

class Property
{
	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		String s=p.getProperty("ahmed");
		System.out.println(s);
		p.setProperty("ahmed","889888");
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"updated by wakeel");

	}

}