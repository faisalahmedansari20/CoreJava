import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class WorkerThread implements Runnable
{
	private String message;
  
   public WorkerThread(String s)
	{
      this.message=s;
	}

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"start message ="+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	
	 private void processmessage()
	{
			try
			{
				Thread.sleep(2000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}

  public class MainThreading
  {
	  public static void main(String[] args)
	  {
       ExecutorService ex=Executors.newFixedThreadPool(5);
	   for(int i=0;i<10;i++)
		  {
		   Runnable r=new WorkerThread(""+i);
		   ex.execute(r);
		  }
		  ex.shutdown();
		  while(!ex.isTerminated())
		  {}
          System.out.println("Finished All");
	  }
  }






  