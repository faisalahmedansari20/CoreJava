import java.util.*;

class Collect
{
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList<String>();
		List<String> ls1=new ArrayList<String>();

		ls.add("india");
		ls.add("pakistan");
		ls.add("nepal");
		ls.add("lanka");
		ls.add("new");
		ls.add("lanka");
		ls.add("zim");
        ls.add("bangla"); 

        ls1.add("lanka");
		ls1.add("bangla");

         Iterator<String> itr=ls.iterator();

		 while(itr.hasNext())
		{
			 String s=itr.next();
			 System.out.println(s);
		}





//        System.out.println(ls.hashCode());
//          System.out.println(ls.equals(ls1));



//		System.out.println(ls.containsAll(ls1));

//          String[] str=(String[])ls.toArray();
//		  System.out.println(str);


//		ls.addAll(ls1);
//       System.out.println(ls.size());
//
// 		System.out.println(ls);
//      
//	    ls.clear();
//		 		System.out.println(ls);

//		ls.remove("lanka");
//        ls.removeAll(ls1);
//		System.out.println(ls);
	}
}