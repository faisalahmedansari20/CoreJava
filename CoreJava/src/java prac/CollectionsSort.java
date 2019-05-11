import java.util.*;

class CollectionsSort
{
	public static void main(String[] args)
	{
		List ls=new ArrayList();
		ls.add(80);
		ls.add(200);
		ls.add(201);
//		ls.add(80 );
//		ls.add(700);
//		System.out.println(ls);
	
	    Collections.sort(ls,new MyCom());
		System.out.println(ls);	
	}
}

class MyCom implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
 
//        System.out.println(i1);
//		return -i2.compareTo(i1);
         if (i1<i2)
		{
		    System.out.println("in the i1 less "+i1+" "+i2);
			return 1;
		}
		else if(i1>i2)
		{
			System.out.println("in the i1 greater "+i1+" "+i2);
			return -1;
		}
		
			else 
				return 0;

	}
}