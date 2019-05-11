import java.io.*;

class FileCreating
{
	public static void main(String[] args)throws Exception
	{
////		File f=new File("d:\","abc.txt");
//		File f=new File("d:","abc.txt");
//		System.out.println(f.exists());
////		f.createNewFile();
////		System.out.println(f.exists());
//		f.mkdir();	
//        System.out.println(f.exists());
//		File f1=new File(f,"abc.txt");
//		f1.createNewFile();
	    File f=new File("d:\\");
		String[] s=f.list();
		int count=0;
		for(String s1:s)
		{
			File ff=new File(f,s1);
			if(ff.isDirectory())
			{
				count++;
			System.out.println(s1);
			}
			System.out.println(count);
		}
	
	
	
	
	
	}
}