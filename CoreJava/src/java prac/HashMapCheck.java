import java.util.*;

class HashMapCheck
{
	public static void main(String[] args)
	{
		Map m=new HashMap();

		m.put("xyz",100);
		m.put("abc",200);
		System.out.println(m.put("mkn",300));

		System.out.println(m);
		System.out.println("overriding xyz with value 400  ="+m.put("xyz",400));

		System.out.println("print map = "+m);
		Set s=m.keySet();
		System.out.println(" set print= "+s);
		Collection c=m.values();
		System.out.println("print Collection ="+c);
		Set s1=m.entrySet();
		System.out.println("Entry Set print ="+s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry mp=(Map.Entry)itr.next();
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
	}

	 
	




}