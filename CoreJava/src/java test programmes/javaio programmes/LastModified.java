import java.io.*;
import java.util.*;
public class LastModified
{
 public static void main(String[] args)
 {
	 File f=new File("D:\\aaa.txt");
	 Long timestamp=f.lastModified();//lastModified();
	 System.out.println("last modified date is :"+new Date(timestamp));
 }
}

  