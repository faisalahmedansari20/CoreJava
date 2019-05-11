import java.util.*;

public class ArrayLis
{
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<>();
		ls.add("mw");
		ls.add("mk1");
        ls.add(0,"mk2");

 		Iterator<String> itr=ls.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			System.out.println(s);
		}
	}
}