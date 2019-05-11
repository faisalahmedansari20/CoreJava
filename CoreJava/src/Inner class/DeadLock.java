class DeadLock
{
	public void m1()
	{
		synchronized(Integer)
		{
			System.out.println("in the  Integer Lock of m1");
	       try
	       {
				   Thread.sleep(2000);
	       }
	       catch (Exception e)
	       {
			   e.printStackTrace();
	       }
		}
       
	   synchronized(String)
		{
			System.out.println("in the  String Lock of m1");
		}
	}
	public void m2()
	{
		synchronized(String)
		{
			System.out.println("in the  String Lock of m2");
		}
        synchronized(Integer)
		{
			System.out.println("in the  Integer Lock of m2");
		
		try
	       {
				   Thread.sleep(2000);
	       }
	       catch (Exception e)
	       {
			   e.printStackTrace();
	       }
		}
	}
	 public static void main(String[] args)
	{
		 DeadLock obj=new DeadLock();
          
		  obj.m1();
		  obj.m2();
	}



}