import java.io.*;

public class BufferedInputputStreamClass11
{
	 public static void main(String[] args)
	{
		 try
		 {
			BufferedInputStream bin=new BufferedInputStream(new FileInputStream("D:\\java test programmes\\javaio programmes\\new.txt"));

			  System.out.println(bin.available());
			  int k=0;
			  while((k=bin.read())!=-1)
			 {
			 System.out.println();
			 System.out.print(" "+(char)k);
             System.out.println(bin.available());

			 }
               bin.close();
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
	}
}