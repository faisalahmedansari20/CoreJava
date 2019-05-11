import java.io.*;
import java.util.*;
import java.text.*;

public class FileProperty
{
	public static void main(String[] args)
	{
		File f=new File("D:\\Chrome download\\movies\\bollywood movies\\Fukrey (2013) 720p WEBHD x264 - RDLinks\\testout.txt");
//       		File f=new File("D:\\Chrome download\\");

//		String name=f.getName();
//		System.out.println(name);
//
//       String path=f.getPath();
//	   System.out.println(path);
//
//       long length=f.length();
//	   System.out.println(length);

//       String[] fileList=f.list();
//	   for(String s:fileList)
//		{
//		   System.out.println(s);
	//	}
//            File f1=new File("");
//           File[] root=f1.listRoots();
//		   for(File r:root)
	//	{
//			   System.out.println(r);
	//	}

//           boolean b=f.canRead();
//		   System.out.println(b);
//
//           String r=f.canRead()? "+r":"-r";
//		   System.out.println(r);

         String s=f.canWrite()?"+w":"-w";
         System.out.println(s);

        long l=f.lastModified();
		Date d=new Date(l);
		SimpleDateFormat  sm=new SimpleDateFormat("dd/MM/yyyy");
        String ste=sm.format(l);
		System.out.println(ste);
	}
}