class ThreadMoreObject implements Runnable
{
	public void run()
	{
		System.out.println("hi");
	}

	public static void main(String[] arga)
	{
     ThreadMoreObject obj1=new ThreadMoreObject();
	 ThreadMoreObject obj2=new ThreadMoreObject();

	  Thread t1=new Thread(obj1,"t1");
      Thread t2=new Thread(obj2,"t1");
	   t1.start();
	   t2.start();

	   System.out.println("name="+t1.getName());
	   System.out.println("name="+t2.getName());
	}
}