import java.io.*;

public class  FileChecking
{
	public static void main(String[] args)
	{
		File f=new File("D:\\Chrome download\\t");
		boolean b=f.exists();
		System.out.println(b);

     long length=f.length();
	 System.out.println(length);

      boolean success=f.renameTo(new File("D:\\Chrome download\\t"));
      System.out.println(success);  


//		if(!b)
//		{
//			boolean bo=f.mkdirs();
//			System.out.println(bo);
//		}
	}
}