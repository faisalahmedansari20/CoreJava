interface MainThreads1
{
     public void mk();

	 public static void main(String[] args)
	{
		 MainThreads1 obj=new MainThreads1();
	}

}


/*
class MainThreads1
{
	public void mk(Object... o)
	{
		System.out.println("int  var arg");
	}
	public void mk(char[] i)
	{
		System.out.println("in the nons var arg");
	}
    public static void main(String[] args)
	{
       MainThreads1 t1=new MainThreads1();
	   Character[] c1=new Character[]{'A','B'};
      t1.mk();
	}
}
*/


/*
class MainThreads1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args)
	{
       MainThreads1 t1=new MainThreads1();
	   MainThreads1 t2=new MainThreads1();
	   t1.start();
	   try
	   {
		t1.join();
	   }
	   catch (Exception e)
	   {
	   }
	   t2.start();

	   for (int i=0;i<10 ;i++ )
	   {
			System.out.println("hi");
	   }
	}
}
*/




/*
class Thred extends Thread
{
	int total=0;
	public static synchronized void gk()
	{

	}
	public void run()
	{
	   synchronized(this)
		{
		   System.out.println("child thread statrs calcultaion");
		   for(int i=0;i<=10;i++)
			{
			   total=total+i;
			}
		   System.out.println("child thread try to call notify");
//		   this.notify();
	}
  }
}


   class MainThreads1
   {
	   public static void main(String[] args)
	   {
   	    Thred t=new Thred();
   	    t.start();
//		try
//		    {
//				Thread.sleep(100);
//		    }
//		    catch (Exception e)
//		    {
//		    }
		synchronized(t)
		   {
		   System.out.println("main thread try to call wait method");
		    try
		    {
				t.wait();
		    }
		    catch (Exception e)
		    {
		    }
		   System.out.println("main thread got intrrputed");
		   System.out.println(t.total);
		   }
       }
   }
*/




/*
class Thred extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i++)
			{
				System.out.println(i);
			}
		try
		{
		Thread.sleep(1000);
		}
		catch (Exception e)
		{
		}
	}
}


   class MainThreads1
   {
	   public static void main(String[] args)
	   {
   	    Thred t=new Thred();
   	    t.start();
		for(int i=1000;i<2000;i++)
			{
				System.out.println(i);
			}
		t.interrupt();
		System.out.println("Interrupted");

       }
   }

*/



/*
class Dead 
{
	public void m1()
	{
		synchronized(Integer.class)
		{
			System.out.println("in the Integer class of m1");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{}
			synchronized(String.class)
			{
			System.out.println("in the String class of m1");
			}
		}
	}

		public void m2()
	{
		synchronized(String.class)
		{
			System.out.println("in the String class of m2");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{}
			synchronized(Integer.class)
			{
			System.out.println("in the Integer class of m2");
			}
		}
	}
}
class Threading1 extends Thread
{
         Dead d;
 
        Threading1(Dead d)
	{
			this.d=d;
	}
	public void run()
	{
		d.m1();
	}
}
class Threading2 extends Thread
{
         Dead d;
 
        Threading2(Dead d)
	{
			this.d=d;
	}
	public void run()
	{
		d.m2();
	}
}

class MainThreads1
{
	public static void main(String[] args)
	{
     Dead d=new Dead();
     Threading1 t1=new Threading1(d);
	 Threading2 t2=new Threading2(d);
	 
	 t1.start();
	 t2.start();
	}

}
*/

/*
class ThreadB extends Thread
 {
	 int total=0;
	 public void run()
	 {
		 synchronized(this)
		 {
			 System.out.println("child starts");
			 for(int i=0;i<10;i++)
			 {
				 total=total+i;
			 }
		      System.out.println("child give notification");
			  this.notify();
		 }
	 }

 }
 
 
 class MainThreads1
 {
       public static void main(String[] args)
	 {
		   ThreadB obj=new ThreadB();
		   obj.start();
		   try
		   {
			Thread.sleep(1000);
		   }
		   catch (Exception e)
		   {
		   }

		   synchronized(obj)
		 {
		      System.out.println("main trying to call wait() method");
                 try
                 {
					obj.wait();
                 }
                 catch (Exception e)
                 {
                 }
		      System.out.println("main thread got interrupted");
              System.out.println(obj.total);
		 }
	 }
 }
*/



/*
class Displ
{
	public    void dispn()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println("in dispn="+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{}
		}
	}
	
		  public   void dispc()
	    {
		    for(int i=1;i<=10000;i++)
		    {
		    	System.out.println("in the dispc="+i);
//		    	try
//		    	{
//		    		Thread.sleep(1000);
//		    	}
//		    	catch (Exception e)
//		    	{}
		    }
	    }
}
class MyThreads1 extends Thread
{
	Displ d;

	MyThreads1(Displ d)
	{
		this.d=d;
	}
	public void run()
	{
		d.dispn();
	}
}

class MyThreads2 extends Thread
{
	Displ d;

	MyThreads2(Displ d)
	{
		this.d=d;
	}
	public void run()
	{
		d.dispc();
	}
}

class MainThreads1
{
	public static void main(String[] args)
	{
      Displ obj=new Displ();
//      Displ obj1=new Displ();

//	 MyThreads1 t2=new MyThreads1(obj);
     MyThreads1 t1=new MyThreads1(obj);
	 MyThreads2 t2=new MyThreads2(obj);

	 t2.setPriority(10);

	 t2.start();
	 try
	 {
		t2.join();
	 }
	 catch (Exception e)
	 {
	 }
	 t1.start();

	}
}
*/

