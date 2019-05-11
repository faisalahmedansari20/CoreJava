import java.io.*;

public class FileInputStreamClass
{
	 public static void main(String[] args)
	{
		 try
		 {
			FileOutputStream fout=new FileOutputStream("D:\\java test programmes\\javaio programmes\\new.txt");
			// fout.write(65);
			 String s="Hi how are you";
			 byte b[]=s.getBytes();
			 fout.write(b);
			 fout.close();
			 System.out.println("Success");
           
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
	}
}