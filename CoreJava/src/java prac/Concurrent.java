import java.util.concurrent.*;

class Concurrent
{
	public static void main(String[] args)
	{
		ConcurrentMap mp=new ConcurrentHashMap();

		mp.put(101,"A");
		mp.put(102,"B");
		mp.put(103,"C");
//      System.out.println(mp.putIfAbsent(104,"A"));
//      System.out.println(mp.remove(101,"B"));
        System.out.println(mp.replace(101,"A","Q"));


        System.out.println(mp);
	}


}