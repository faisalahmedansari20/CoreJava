import java.util.*;

class SortedMapChecking
{
	public static void main(String[] args)
	{
//		TreeMap mp=new TreeMap();
        TreeMap mp=new TreeMap(new MyComParators());
		mp.put(100,"zzz");
		mp.put(103,"yyy");
		mp.put(101,"xxx");
		mp.put(104,106);
//		mp.put("m","ss");  // ClassCastException
		System.out.println(mp);
		System.out.println(mp.firstKey());
		System.out.println(mp.lastKey());
		System.out.println(mp.headMap(103));
		System.out.println(mp.tailMap(103));



	}
}

class MyComParators implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;

		return i1.compareTo(i2);
	}

}