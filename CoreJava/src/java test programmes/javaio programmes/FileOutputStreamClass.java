import java.io.*;

public class FileInputputStreamClass1
{
	 public static void main(String[] args)
	{
		 try
		 {
			FileInputStream fin=new FileInputStream("D:\\java test programmes\\javaio programmes\\new.txt");
            int i=fin.read();
			 System.out.println(i);
           
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
	}
}