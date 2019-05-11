import java.util.*;

class Binary
{
	public static void main(String[] args)
	{
		List ls=new ArrayList();

		ls.add(300);
		ls.add(400);
		ls.add(200);
		ls.add(100);

       System.out.println(ls);
         Collections.sort(ls,new MyCom());
		 System.out.println(ls);
//		 System.out.println(Collections.binarySearch(ls,101));
//       Collections.sort(ls,new MyCom());
      System.out.println(Collections.binarySearch(ls,-101,new MyCom()));
       

	}
}
class MyCom implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
 
         if (i1<i2)
		{
			return 1;
		}
		else if(i1>i2)
		{
			return -1;
		}
			else 
				return 0;

	}
}