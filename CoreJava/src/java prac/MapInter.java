import java.util.*;

class MapInter
{ 
	public static void main(String[] args)
	{
		Map<Integer,String> mp=new HashMap<>();

		System.out.println(mp.put(101,"xyz"));
		System.out.println(mp.put(102,"abc"));
		System.out.println(mp.put(101,"ravi"));
	}
}