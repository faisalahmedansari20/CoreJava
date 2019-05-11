class ThreadThis extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("hi= "+this.getName());
	}

	public static void main(String[] args)
	{
		ThreadThis t1=new ThreadThis();
		 t1.start();
         t1.setName("mw"); 

	}
}