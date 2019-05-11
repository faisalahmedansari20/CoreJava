import java.io.*;

class Files
{
 public static void main(String[] args)
 {
  File f=new File("D:\\java test programmes\\text files");
  String[] filenames=f.list();
  for(String filename:filenames)
  {
   System.out.println(filename);
   }
  }
}