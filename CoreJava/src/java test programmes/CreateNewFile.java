import java.io.*;

class CreateNewFile 
{
	
	public static void main(String[] args) 
	{
      File f=new File("D:\\malik\\java\\abc.txt");  
	  f.mkdir();c
	  
      String[] filelist=f.list();

	  for(String s: filelist)
		{
		  System.out.println(s);
		  File[] root=File.listRoots();
		  for(File r:root)
			{
			  System.out.println(r);
			}
		}




//      String name=f.getName();
//	  String name1=f.getPath();
//	  System.out.println(name);
//	  System.out.println(name1);
//
//	  int size=f.length();
//	  System.out.println(size);
	
	}
}


