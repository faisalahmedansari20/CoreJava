import java.util.*;

class WeakMapTest
{
        public String toString()
	{
			return "temp";
	}
	public void finalized()
	{
		System.out.println("finalized invoked");
	}



	public static void main(String[] args)
	{
//		Map mp=new WeakHashMap();
       Map mp=new HashMap();
		 WeakMapTest t=new WeakMapTest();

		 mp.put(t,"abc");
		 System.out.println(mp);
		 t=null;
		 System.gc();
        try
        {
					 Thread.sleep(3000);
        }
        catch (Exception e)
        {
			e.printStackTrace();
        }
         System.out.println(mp);
	}
}