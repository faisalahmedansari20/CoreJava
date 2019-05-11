import java.io.*;

public class CharArray
{
 public static void main(String[] args) throws Exception
 {
  CharArrayWriter out=new CharArrayWriter();
  out.write(" hi how are you ");

  FileWriter fr1=new FileWriter("D:\\java test programmes\\text files\\char1.txt");
  FileWriter fr2=new FileWriter("D:\\java test programmes\\text files\\char2.txt");

  out.writeTo(fr1);
  out.writeTo(fr2);

  fr1.close();
  fr2.close();

  System.out.println("Success");
  }
}