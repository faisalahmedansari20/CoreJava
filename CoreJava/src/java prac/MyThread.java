import java.util.*;

class MyThread extends Thread
{
	static List ls=new ArrayList();

	public void run()
	{
		System.out.println(" thread is updatin");
	     System.out.println(ls.add("D"));
		 System.out.println("in hw");
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e)
		{}

	}

	public static void main(String[] args)
	{
		ls.add("A");
		ls.add("B");
		ls.add("C");

		MyThread t=new MyThread();
        t.start();
		Iterator itr=ls.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println("Main thread itrating list and current object list is "+s);
			try
			{
			Thread.sleep(3000);
			}
			catch (Exception e)
			{
			}
			System.out.println(s);

		}

	}

}