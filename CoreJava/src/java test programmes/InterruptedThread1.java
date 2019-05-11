class InterruptedThread1 extends Thread
{
 public void run() 
 {
  try
   {
    Thread.sleep(10000);
    }
    catch( Exception e)
    {
      throw new RuntimeException("yes");
     }
     }

     public static void main(String[] args)
     {
      InterruptedThread1 t1=new InterruptedThread1();
      t1.start();
      try
      {
		t1.interrupt();
      }
      catch (Exception e)
      {
		  System.out.println("Eception handled :"+e);
      }

      }
}