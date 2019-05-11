import java.io.*;
class BufferesInputStream 
{
 public static void main(String[] args)throws Exception
 {
   try
   {
     FileInputStream fin=new FileInputStream("D:\\xyz1.txt");
     BufferedInputStream bif=new BufferedInputStream(fin);

      int i;
	  int x=bif.available();
	  System.out.println(x);
      long l=bif.skip(3);
	  while((i=bif.read())!=-1)
      {
     
       System.out.print((char)i);
       }
       bif.close();
       fin.close();
       }

       catch(Exception e)
       {
       System.out.println(e);
       }
}
}
      