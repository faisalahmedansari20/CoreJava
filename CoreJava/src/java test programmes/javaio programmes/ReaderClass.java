import java.io.*;

class ReaderClass
{
 public static void main(String[] args)
 {
 try
 {
  Reader r=new FileReader("D:\\java test programmes\\text files\\mk1.txt");
  Writer wr=new FileWriter("D:\\java test programmes\\text files\\mk2write.txt");

  int i=r.read();
  while(i !=-1)
  {
	char c=(char)i;
    wr.write(c);
    }
    wr.close();
    r.close();
    }
  catch(Exception e)
  {
   }
   }
}