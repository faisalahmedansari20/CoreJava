import java.io.*;  
public class DataStreamExample 
{  
public static void main(String args[])throws Exception
	{    
      FileOutputStream fout1=new FileOutputStream("D:\\java test programmes\\javaio programmes\\new1.txt");    
      FileOutputStream fout2=new FileOutputStream("D:\\java test programmes\\javaio programmes\\new2.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	  String s="hi how are you";
	  byte[] b=s.getBytes();
      bout.write(b);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
        
      bout.flush();    
      bout.close();//has no effect    
      System.out.println("Success...");    
     }    
    }   