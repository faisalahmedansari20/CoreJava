import java.util.*;

class Hlm
{
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<>();
        long l=System.currentTimeMillis();
		for(double i=1000;i>0;i--)
		{
			String s="abc"+i;
			System.out.println(s);
			ls.add(s);
		}
        long l1=System.currentTimeMillis();
         System.out.println(" total time in ms="+(l1-l)+"ms"); 
	}
}