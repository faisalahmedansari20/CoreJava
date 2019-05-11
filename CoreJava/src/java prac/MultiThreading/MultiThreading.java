class  Ext extends Thread
{
//	public void start()
//	{
//		System.out.println("ini the Ext class");
//	}
    public void run()
	{
        System.out.println(Thread.currentThread().getName());
		System.out.println("in the run of Ext class");
	}
}


class MultiThreading extends Thread
// class MultiThreading  implements Runnable

{
//	public void start()
//	{
//		System.out.println(Thread.currentThread().getName());
//		super.start();
//		System.out.println("start");
//	}
//   public void run()
//	{
//		System.out.println(Thread.currentThread().getName());
//        System.out.println("hi");
//	}

//	public void run(int i)
//	{
//        System.out.println("hi");
//	}

	public static void main(String[] args)
	{
        MultiThreading obj=new MultiThreading();
//		Thread t=new Thread(obj,"MW");
//		Ext t1=new Ext();
//		t1.start();
//		t.start();
        obj.start();
	}
}	