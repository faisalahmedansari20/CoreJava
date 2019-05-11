import java.io.*;

class FileOutString
{
 public static void main(String[] args)
 {
 try
 {

  FileOutputStream   fout=new  FileOutputStream("D:\\java test programmes\\javaio programmes\\abcd.txt");

  String s="how are you  wwwwww";
  byte[] b=s.getBytes();

  fout.write(b);
  fout.close();

}
catch(Exception e)
{
 }
 }
}