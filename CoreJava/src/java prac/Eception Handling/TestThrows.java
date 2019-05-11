import java.io.*;

class TestThrows
{
	public static void main(String[] args)throws FileNotFoundException 
	{
		m1();
	}
	
	public static void m1()throws FileNotFoundException 
	{
		m2();
	}

	public static void m2()throws FileNotFoundException 
	{
		m3();
	}

	public static void m3()throws FileNotFoundException
	{
		File f=new File("D:\\Aa.java");
		FileInputStream fis=new FileInputStream(f);
	}
}