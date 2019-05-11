import java.io.*;

public class Stream
{
 public static void main(String[] args)throws Exception
 {
   DataInputStream dis=new DataInputStream(System.in);  
   String s=dis.readLine();

   System.out.println(s);
   }
   }
