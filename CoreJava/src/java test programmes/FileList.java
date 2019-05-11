import java.io.*;
class FileList
{
  public static void main(String[] args)
  {
     File f=new File("D:\\java test programmes");
     String[] filename=f.list();

     for(String filenames:filename)
     {
     System.out.println(filenames);
     }
     }
}
