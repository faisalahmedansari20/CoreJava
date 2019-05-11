import java.util.*;
import java.util.concurrent.*;

class NullChecking
{
	public static void main(String[] args)
	{
//		Map mp=new HashMap();
//		ConcurrentMap mp=new ConcurrentHashMap();
//       HashMap mp=Collection.synchronizedMap();
//         Hashtable mp=new Hashtable();
//		mp.put(null,null);
	
//	    CopyOnWriteArrayList cr=new CopyOnWriteArrayList();
//        List cr=new ArrayList();
//         ConcurrentMap cr=new ConcurrentHashMap();

		cr.add("A");
		cr.add("C");
		cr.add("B");

		Iterator itr=cr.iterator();
		cr.add("D");
		while(itr.hasNext())
		{
         System.out.println(itr.next());
		}
		System.out.println(cr);
	
	
	}

}