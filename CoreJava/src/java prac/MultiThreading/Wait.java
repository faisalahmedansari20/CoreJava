class Wait
{
	public static void main(String[] args)throws InterruptedException
	{
		ThreadB t=new ThreadB();
		t.start();
		Thread.sleep(1000);
		synchronized(t)
		{
			System.out.println("main thread trying to call wait() method ");
			t.wait();
			System.out.println("main thread got interrupted");
			System.out.println(t.total);
		}
	}
}

class ThreadB extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread starts calculation");
    		for(int i=0;i<5;i++)
	     	{
             total=total+i;
			}
			System.out.println("child thread trying to give notification ");
			this.notify();
		}
	}
}