import java.util.*;

class MapChecking
{
	public static void main(String[] args)
	{
		Map<Integer,Integer> mp=new HashMap<>();

		 mp.put(1,1);
		 mp.put(2,1);
		 mp.put(3,1);
         mp.put(1,2);
		 mp.put(1,3);
		 System.out.println(mp);
	}
}