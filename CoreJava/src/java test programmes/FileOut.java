import java.io.*;

class FileOut
{
 public static void main(String[] args)
 {
 try
 {
  FileOutputStream   fout=new  FileOutputStream("D:\\java test programmes\\javaio programmes\\abcd.txt");
  fout.write(65);
  fout.close();
  }
  catch(Exception e)
  {
  
   }
   }
}   