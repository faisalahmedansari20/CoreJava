import java.util.*;

class Iter
{
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<>();
		ls.add("hi");
		ls.add("hi1");
		ls.add("hi2");
 
         Iterator itr=ls.iterator();

        while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	

//		for(String s:ls)
//		{
//			System.out.println(s);
//		}
	}

}