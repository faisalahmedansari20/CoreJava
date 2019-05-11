import java.util.concurrent.atomic.AtomicInteger;

class ThreadDemoNonVolatil extends Thread
{
 private static final Object lock=new Object();
 private String abc="hello";

 final AtomicInteger i=new AtomicInteger();

 public void get1()
	{
	 System.out.print(Thread.currentThread().getName()+"=");
	 synchronized(lock)
		{
		 abc="Hello :"+i.incrementAndGet();
		 try
		 {
			Thread.sleep(100);
		 }
		 catch (Exception e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("changed :"+abc+"="+Thread.currentThread().getName());


		}
	}
	public void get2()
	{
		System.out.println(abc+"="+Thread.currentThread().getName());

	}
	public void get3()
	{
		synchronized(lock)
		{
			System.out.println(abc+"="+Thread.currentThread().getName());

		}
	}
    public static void main(String[] args)
	{
		final ThreadDemoNonVolatil s=new ThreadDemoNonVolatil();

		new Thread(new Runnable() {
			public void run()
			{
				s.get1();
			}
		},"t1").start();


		new Thread(new Runnable() {
			public void run()
			{
				s.get2();
			}
		},"t2").start();

           new Thread(new Runnable() {
               public void run()
			   {
				   s.get3();
			   }
		   },"t3").start();
	}
}


             























