class ThreadJoinChecking
{
 public static void main(String[] args)
 {
   Thread t1=new Thread(new MyRunnable1(),"t1");
   Thread t2=new Thread(new MyRunnable1(),"t2");
   Thread t3=new Thread(new MyRunnable1(),"t3");

   t1.start();
   try
   {
    t1.join(100);
    }
    catch(InterruptedException e)
    {
     e.printStackTrace();
    }
    
    t2.start();

	try
	{
		t1.join();
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}

    try
    {
		t2.join(3);

    }
    catch (InterruptedException e)
    {
		e.printStackTrace();
    }
	t3.start();

    try
    {
     t1.join();
     t2.join();
     }
     catch(Exception e)
     {
      e.printStackTrace();
      }


  }

 }


 class MyRunnable1 implements Runnable
 {
  public void run()
  {
   System.out.println("Thread Started : ::"+Thread.currentThread().getName());
    try
     {
      Thread.sleep(4000);
      }
      catch(InterruptedException e)
      {
       e.printStackTrace();
       }
       System.out.println("Thread Ended: :: "+Thread.currentThread().getName());
       }
}