import java.io.*;

 public class Writer1
 {
  public static void main(String[] args)
  {
  try
   {
	 File f=new File("D:\\java test programmes\\text files\\mk1.txt");
     Writer r=new FileWriter(f);
     String s="hi how are you";
//	 char[] ch={'a','b','c','d'};
	  r.write(s);
      r.close();
     }

     catch(IOException e)
     {
      e.printStackTrace();
      }
      }
}