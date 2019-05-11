import java.io.*;

 public class FileChecking
 {
  public static void main(String[] args)
	 {
    	File f=new File("D:\\java test programmes\\javaio programmes");
	
		 File[] files=f.listFiles();
         for(File ff:files) 
		 {
			 System.out.println(ff);
		 }
 
		String s[]=f.list();
		for(String file:s)
		   {
		//	System.out.println(file);
		   }
		try
	   {
       if(f.createNewFile())
		   {
			System.out.println("new File is created");
		   }
		   else
		   {
			   System.out.println("file is already has created");
		   }
	   }
	   catch (IOException e)
	   {
		   e.printStackTrace();
	   }
	 }
 }