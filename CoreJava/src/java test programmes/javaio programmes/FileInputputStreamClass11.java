import java.io.*;

public class FileInputputStreamClass11
{
	 public static void main(String[] args)
	{
		 try
		 {
			FileInputStream fin=new FileInputStream("D:\\java test programmes\\javaio programmes\\new.txt");
//            int i=fin.read();
              int k=0;
			  while((k=fin.read())!=-1)
			 {
             System.out.print(" "+k);
//			 System.out.print(" "+(char)k);

			 }
               fin.close();
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
	}
}