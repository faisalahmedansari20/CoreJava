class Display1
{
	public void wish(String name)
	{
		System.out.println(Thread.currentThread().getName());
		synchronized(this)
		{
		  for(int i=0;i<2;i++)
			{
			  System.out.println(" before good "+Thread.currentThread().getName());
			  try
			  {
				Thread.sleep(200);
			  }
			  catch (InterruptedException ie)
			  {
			  }
			  			  System.out.println(" after good "+Thread.currentThread().getName());
			}
		}
   }
}
class MyThread4 extends Thread
{
	Display1 d;
	String name;

	MyThread4(Display1 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class MainThread1
{
	public static void main(String[] args)
	{
      Display1 d=new Display1();
      MyThread4 t1=new MyThread4(d,"xyz");
      MyThread4 t2=new MyThread4(d,"abc");
 
      t1.start();
      t2.start();

	}
}