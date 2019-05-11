import java.util.*;

class TreeSorting
{
	public static void main(String[] args)
	{
//		TreeSet t=new TreeSet();
        TreeSet t=new TreeSet(new MyComparator()); 
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(80);

		System.out.println(t);
}
}

class MyComparator implements Comparator
{
 
	  public int compare(Object obj1,Object obj2)
		{

		  Integer i1=(Integer)obj1;
		  Integer i2=(Integer)obj2;

//           return i1.compareTo(i2);  
//           return -i1.compareTo(i2);  
//		   return i2.compareTo(i1);
//		   return -i2.compareTo(i1);
           return 1;
//             return -1;


//		  if(i1<i2)
//			{
//			  return -1;
//			}
//			else if(i1>i2)
//			{
//				return 1;
//			}
//			else 
//				return 0;
		}
}