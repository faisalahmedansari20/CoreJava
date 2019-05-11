import java.util.*;


class ToArray
{
	public static void main(String[] args)
	{
      List ls=new ArrayList();

	  ls.add(10);
	  ls.add(20);
	  ls.add(30);
	  ls.add(22);
   System.out.println(ls);
	
	  Object[] i=ls.toArray();
	  for(int in=0;in<i.length;in++)
		{
		  System.out.println(i[in]);
		}
	
	}
}