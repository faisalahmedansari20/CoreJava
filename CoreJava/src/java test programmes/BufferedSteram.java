import java.io.*;

public class BufferedSteram
{
 public static void main(String[] args) throws Exception
 {
          FileOutputStream bout=new FileOutputStream("D:\\xyz1.txt");
	  BufferedOutputStream bout1=new BufferedOutputStream(bout);

       String s="My name Is khan";    
	   byte b[]=s.getBytes();
	   

		   bout1.write(b);

          
	   bout1.flush();
	   bout.close();
	   bout1.close();

	   System.out.println("Success");
	   }
}