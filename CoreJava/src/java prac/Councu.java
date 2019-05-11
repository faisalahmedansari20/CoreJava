import java.util.*;
import java.util.concurrent.*;

class Councu
{
	public static void main(String[] args)
	{
		 ConcurrentMap cr=new ConcurrentHashMap();

		 cr.put("A","SS");
		 cr.put("B","FFF");
		 cr.put("C","RRFF");
 
          Set s=cr.entrySet();

       Iterator itr=s.iterator();
	   cr.put(15,"wewd");

      while(itr.hasNext())
		{
		  Map.Entry m=(Map.Entry)itr.next();
		  System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(cr);
	}
}