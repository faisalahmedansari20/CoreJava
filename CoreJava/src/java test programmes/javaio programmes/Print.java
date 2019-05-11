import java.io.*;

public class Print
{
 public static void main(String[] args)throws Exception
 {
  FileOutputStream fout=new FileOutputStream("D:\\java test programmes\\text files\\xyz.txt");
  PrintStream pout=new PrintStream(fout);

  pout.println(2016);
  pout.println(" hi how are you");

  pout.close();
  fout.close();

  System.out.println("Success");
  }
}