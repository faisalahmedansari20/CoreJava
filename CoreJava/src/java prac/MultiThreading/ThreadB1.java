class Wait1
{
	public static void main(String[] args)throws InterruptedException
	{
		Main1 obj=new Main1();
		ThreadB1 t1=new ThreadB1(obj,"xyz");
	    ThreadB2 t2=new ThreadB2(obj,"abc");
		t1.start();
		t2.start();
	}
}

class ThreadB1 extends Thread
{
	Main1 obj;
	String name;

	ThreadB1(Main1 obj,String name)
	{
		this.obj=obj;
		this.name=name;
	}
	public void run()
	{
      obj.mk(name);      
	}
}

class ThreadB2 extends Thread
{
	Main1 obj;
	String name;

	ThreadB2(Main1 obj,String name)
	{
		this.obj=obj;
		this.name=name;
	}
	public void run()
	{
      obj.gk(name);      
	}
}

class Main1
{
	public synchronized void mk(String name)
	{
		System.out.println(name+" before wait "+Thread.currentThread().getName());
	   try
	   {
		Thread.sleep(3000);
	   }
	   catch (InterruptedException ie)
	   {
	   }
	   try
	   {
		this.wait();
	   }
	   catch (InterruptedException is)
	   {
	   }
		System.out.println(name+" after wait "+Thread.currentThread().getName());
	}
	public synchronized void gk(String name)
	{
		System.out.println(name+" got lock before notify "+Thread.currentThread().getName());
	     this.notify();
		 System.out.println(name+" calls notify  "+Thread.currentThread().getName());
          try
          {
					  Thread.sleep(10);
          }
          catch (InterruptedException ie)
          {
          }
          System.out.println("hi");
           try
          {
					  Thread.sleep(1000);
          }
          catch (InterruptedException ie)
          {
          }
          System.out.println("hi in the ");
	}
}