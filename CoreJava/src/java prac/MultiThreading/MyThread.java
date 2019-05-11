class MyThread extends Thread
{
	public void run()
	{
		System.out.println("in the run muthread");
	}
}
  class ThreadDemo
  {
	  public static void main(String[] args)
	  {
		  MyThread t=new MyThread();
//		  if(t instanceof Runnable)
//			  System.out.println("it is instance");
		  Thread t1=new  Thread(t);
		  t1.start();
       }
  }