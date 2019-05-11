class Display
{
	public static synchronized  void wishn(String name)
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(name+" before n "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException ie) 
			{
			}
			System.out.println(name+" after n "+Thread.currentThread().getName());
		}
	}
	public static synchronized void wishc(String name)
	{
		for(int i=0;i<2;i++)
		{
			System.out.println(name+" before c "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(200);
			}
			catch (InterruptedException ie) 
			{
			}
			System.out.println(name+" after c "+Thread.currentThread().getName());
		}
	}
}

class MyThread2 extends Thread
{
	Display d;
	String name;

	  MyThread2(Display d,String name)
	  {
	  	  this.d=d;
	  	  this.name=name;
	  }
	  public void run()
	   {
	   	  d.wishn(name);
	   }
}
class MyThread3 extends Thread
{
	Display d;
	String name;

	  MyThread3(Display d,String name)
	  {
	  	  this.d=d;
	  	  this.name=name;
	  }
	  public void run()
	   {
	   	  d.wishc(name);
	   }
}

     class synchronizedDemo
     {
		 public static void main(String[] args)
		 {
			 Display d=new Display();
             Display d1=new Display(); 
			 MyThread2 t1=new MyThread2(d,"xyz");
			 MyThread3 t2=new MyThread3(d1,"abc");

			 t1.setName("t1");
			 t2.setName("t2");

			 t2.start();
			 t1.start();
		 }

     }












