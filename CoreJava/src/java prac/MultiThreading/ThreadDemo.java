class MyTh extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		MyTh t=new MyTh();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}