import java.util.*;

public class KeySett
{
	public static void main(String[] args)
	{
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"a");
		mp.put(2,"b");
		mp.put(3,"c");

        for(Map.Entry m:mp.entrySet())
		{
           System.out.println(m.getKey()+" "+m.getValue());
		}








		//Iterator itr=mp.entrySet().iterator();

//		while(itr.hasNext())
//		{
//			int i=(Integer)itr.next();
//			System.out.println(i+" "+mp.get(i));
//		}
	}

}