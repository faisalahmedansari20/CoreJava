import java.util.*;

public class ArrayLis
{
	public static void main(String[] args)
	{

       List<String> ls1=new ArrayList<>();
	   ls1.add("wakeel");
	   ls1.add("malik");

		List<String> ls=new ArrayList<>();
		ls.add("mw");
		ls.add("mk1");
        ls.add(0,"mk2");

		ls1.addAll(1,ls);
         
//		 ls1.clear();

        for(String s:ls1)
		{
			System.out.println(s);
		}



// 		Iterator<String> itr=ls1.iterator();
//		while(itr.hasNext())
//		{
//			String s=itr.next();
//			System.out.println(s);
//		}
//          System.out.println(ls1.lastIndexOf("mk1"));
//          System.out.println(ls1.indexOf("malik"));
//		    System.out.println(ls1.size());
//		    System.out.println(ls1.contains("mk1"));
//            System.out.println(ls1.isEmpty());
           System.out.println(ls1.hashCode());





	}
}