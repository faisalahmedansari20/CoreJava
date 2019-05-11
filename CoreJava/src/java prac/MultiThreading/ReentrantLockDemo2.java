import java.util.concurrent.locks.*;

class ReentrantLockDemo2
{
	public static void main(String[] args)
	{
        Display4 d=new Display4();
		MyThread4 t1=new MyThread4(d,"abc");
		MyThread4 t2=new MyThread4(d,"def");
		MyThread4 t3=new MyThread4(d,"ghi");

         t1.start();
         t2.start();
         t3.start();
	}
}

  class Display4
  {
	  ReentrantLock l=new ReentrantLock();
	  
	  public void wish(String name)
	  {
		  System.out.println("in the sys="+Thread.currentThread().getName());
		  l.lock();
		  for(int i=0;i<2;i++)
		  {
			  System.out.println("executed by "+Thread.currentThread().getName());
			  try
			  {
				Thread.sleep(1000);
			  }
			  catch (InterruptedException ie)
			  {
			  }
			  System.out.println("after for "+Thread.currentThread().getName());
		  }
		  l.unlock();
		  System.out.println("after unlock "+Thread.currentThread().getName());
		  try
		  {
			Thread.sleep(5000);
		  }
		  catch (InterruptedException ie)
		  {
		  }
		  System.out.println("after waiting by "+Thread.currentThread().getName());
	  }
  }


class MyThread4 extends Thread
{
	Display4 d;
	String name;

	MyThread4(Display4 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}


