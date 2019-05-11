import java.io.*;

public class ConsoleReader
{
 public static void main(String[] args)throws Exception
 {
  InputStreamReader r=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(r);

      String name="";    
      while(!name.equals("stop"))
		  {    
      System.out.println("Enter data: ");    
      name=br.readLine();    
      System.out.println("data is: "+name);              
   //System.out.println("Enter your name");
   //String s=br.readLine();
   //System.out.println("hello sir how are you:"+s);
   }
 }
}
