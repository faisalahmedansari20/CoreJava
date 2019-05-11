class MyTh extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread="+i);
			Thread.yield();
		}
	}
}

class ThreadDemo1
{
	public static void main(String[] args)
	{
		MyTh t=new MyTh();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread="+i);
		}
	}
}