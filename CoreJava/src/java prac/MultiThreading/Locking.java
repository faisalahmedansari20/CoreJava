import java.util.concurrent.locks.*;
import java.util.concurrent.*;

class Locking extends Thread
{
	static ReentrantLock l=new ReentrantLock();

	 Locking(String name)
	{
		 super(name);
	}
	public void run()
	{
		try
		{
		if(l.tryLock(10001,TimeUnit.MILLISECONDS))
		{
			System.out.println(Thread.currentThread().getName()+" got locked and executes");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ie)
			{
			}
			l.unlock();
		}
			else
		      {
				System.out.println(Thread.currentThread().getName()+" unable to get the lock and hence performing else block execution");
			  }
	    }
		catch (InterruptedException ie)
		       {
				}
  }
}

class ReentrantLockDemo5
{
	public static void main(String[] args)
	{
		Locking t1=new Locking("malik");
		Locking t2=new Locking("ahmed");
		Locking t3=new Locking("MW");

		t1.start();
		t2.start();
		t3.start();
	}
}