import java.util.*;

class ArraysCheck
{
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<>();
		ls.add("b");
		ls.add("d");
		ls.add("a");



		System.out.print(" "+ls);

         Iterator<String> itr=ls.iterator();
        
		   System.out.println();
		  while(itr.hasNext())
		{
			   System.out.print(" "+itr.next());
		}
              System.out.println();
              Collections.sort(ls);
			   System.out.print(ls);

	}
}