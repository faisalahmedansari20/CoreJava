import java.util.concurrent.*;
import java.util.*;

class My extends Thread
{
	static ConcurrentMap mp=new ConcurrentHashMap();

    public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
		}
		System.out.println("updating in the run method ");
		mp.put(103,"Q");
	}
	public static void main(String[] args)
	{
      mp.put(101,"A");
      mp.put(102,"B");

	  My t=new My();
	  t.start();

	  Set s=mp.keySet();
	  Iterator itr=s.iterator();
	  while(itr.hasNext())
		{
		  Integer i=(Integer)itr.next();
		  System.out.println("main thread is updating in the iterator "+i+" value"+mp.get(i));
		  try
		  {
		  Thread.sleep(3000);
		  }
		  catch (Exception e)
		  {
		  }
       }
	           System.out.println(mp);
	}
}