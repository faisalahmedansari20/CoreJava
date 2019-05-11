import java.util.*;

class MapChecking
{
	public static void main(String[] args)
	{
		Map m=new HashMap();
		m.put(100,"A");
		m.put(102,"B");
		m.put(103,"C");

//        Iterator itr=m.entrySet();
            Set s=m.entrySet();
            Iterator itr=s.iterator();

          while(itr.hasNext())
		{
			  Map.Entry en=(Map.Entry)itr.next();
			  System.out.println(en.getKey()+" "+en.getValue());
		}

	
	}
}