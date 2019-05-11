import java.util.*;

class IteratorChecking
{
	public static void main(String[] args)
	{
		Map<String,Integer> m=new HashMap<>();

		m.put("xyz",100);
		m.put("abc",200);
		Set s=m.entrySet();
		for(Map.Entry e:m.entrySet())
	{
			System.out.println(e.getKey()+" "+e.getValue());
	}
	}
}