import java.io.FileOutputStream;  
import java.io.PrintStream;  

public class PrintStreamTest
	{    
 public static void main(String args[])throws Exception
	 {    
 //  FileOutputStream fout=new FileOutputStream("D:\\java test programmes\\javaio programmes\\new.txt");    
   PrintStream pout=new PrintStream("D:\\java test programmes\\javaio programmes\\new.txt");    
   pout.println(2016);    
   pout.println("Hello Javadeded");    
   pout.println("Welcome to Java");    
   pout.close();    
  // fout.close();    
  System.out.println("Success?");    
 }    
}   