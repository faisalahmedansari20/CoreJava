class ThreadChecked extends Thread
{
   ThreadChecked(String name)
	{
	   super(name);
	}

	public void run()
	{
		System.out.println("executed by "+Thread.currentThread().getName());
	}
}

class MainThreading
{ 
	public static void main(String[] args)
	{
        ThreadChecked t1=new ThreadChecked("malik");
        ThreadChecked t2=new ThreadChecked("wakeel");
        t1.start();
		t2.start();
	}
}