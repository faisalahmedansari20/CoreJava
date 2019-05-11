import java.io.*;

public class FileWriterClass1
{ 
 public static void main(String[] args)
 {
	 try{

   FileWriter fw=new FileWriter("D:\\java test programmes\\javaio programmes\\new.txt");
   fw.write("java is best programme");
   fw.close();
	 }
	 catch(Exception e)
	 {
		  e.printStackTrace();
	 }
 }
}