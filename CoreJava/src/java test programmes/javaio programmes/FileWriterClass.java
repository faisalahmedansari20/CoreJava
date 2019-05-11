import java.io.*;

public class FileWriterClass
{
 public static void main(String[] args)
 { 
	 try{

   FileWriter w=new FileWriter("D:\\java test programmes\\javaio programmes\\new.txt");
   String s="i love india1";
   w.write(s);
   w.close();
   System.out.println("Done");
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
}