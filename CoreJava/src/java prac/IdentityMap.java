import java.util.*;

class IdentityMap
{
	public static void main(String[] args)
	{
//		Map mp=new HashMap();
        Map mp=new IdentityHashMap();

        Integer i1=new Integer(10);
		Integer i2=new Integer(10);

		System.out.println(mp.put(i1,"xyz"));
		System.out.println(mp.put(i2,"abc"));

		System.out.println(mp);
	}

}