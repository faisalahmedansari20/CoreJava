import java.util.*;

class LinkedHashMapChecking
{
	public static void main(String[] args)
	{
//		Map<Integer,String> mp=new HashMap<>();
        Map<Integer,String> mp=new LinkedHashMap<>();

		 mp.put(1,"A");
         mp.put(3,"B");
         mp.put(2,"C");

		 for(Map.Entry m:mp.entrySet())
		{
          System.out.println(m.getKey()+" "+m.getValue());
		}
	}


}