import java.io.*;

class ByteArray
{
 public static void main(String[] args)throws Exception
 {
  FileOutputStream fou=new FileOutputStream("D:\\java test programmes\\javaio programmes\\abc.txt");
  FileOutputStream fou1=new FileOutputStream("D:\\java test programmes\\javaio programmes\\abcd.txt");


  ByteArrayOutputStream bout=new ByteArrayOutputStream();
//  String s="hi wakeel how are you";
  //byte[] b=s.getBytes();
  byte[] b={65,44,33,68,23,12};
  bout.write(b);
  bout.writeTo(fou);
  bout.writeTo(fou1); 

  bout.flush();
  bout.close();
  }
}