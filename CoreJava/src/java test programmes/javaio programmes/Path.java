import java.io.*;
public class Path
{
public static void main(String[] args)
	{
  String parent = null;
  File file = new File("D:\\java test programmes\\javaio programmes\\new.txt");
  System.out.println(file.getPath());
  System.out.println(file.getAbsolutePath());
  try
  {
   System.out.println(file.getCanonicalPath());
  } catch (IOException e)
	  {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
}