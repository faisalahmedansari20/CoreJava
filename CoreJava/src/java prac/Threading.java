class Cls
{
//	public void run()
//	{
//		System.out.println("in the run method of Cls class");
//	}
}


class Threading extends Cls implements Runnable
{
	public static void mk()
	{
		System.out.println("in the mk method");
	}
	public void run()
	{
//		System.out.println(Thread.currentThread().getName());
		System.out.println("Hi");
	}

	    public void start()
	      {
			mk();
//			this.start();
//	      	System.out.println(" in the start method "+i);
	      }

 public static void main(String[] args)
 {

     Threading obj=new Threading();
	 Thread t=new Thread(obj);
//	 t.start();
	 obj.mk();
//     obj.run();
 }
}