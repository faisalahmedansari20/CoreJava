class Thr extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

  class Thre
  {
	  public static void main(String[] args)
	  {
		   Thr t=new Thr();
		  t.start();
		  System.out.println("main thread executed by Thread: "+Thread.currentThread().getName());
	  }
  }