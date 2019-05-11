class MyThread2 extends Thread
{
	static Thread mt;
	 
	 public void run()
	{
		 try
		 {
			mt.join();
		 }
		 catch (InterruptedException ie)
		 {System.out.println("exception occurs");}
		 for(int i=0;i<10;i++)
		{
			 System.out.println("in the child thread="+i);
		}
	}
}
class ThreaDemos
{
	public static void main(String[] args)throws InterruptedException
	{
        MyThread2.mt=Thread.currentThread();
        MyThread2 t=new MyThread2();
		t.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("in the main thread="+i);
		}
	}
}
