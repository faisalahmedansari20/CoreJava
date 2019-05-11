class DeadLock extends Thread
{

	DeadLock d;
     
	 DeadLock(DeadLock d)
	{
		 this.d=d;
	}


   public void run()
    {
	   d.m1();
	   d.m2();
	}
	
	public void m1()
	{
		synchronized(Integer.class)
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

		        synchronized(String.class)
		          {
		          	System.out.println("in the  String Lock of m1");
		          }
	}
}
	public void m2()
	{
		synchronized(String.class)
		{
			System.out.println("in the  String Lock of m2");
		 
		 try
	       {
				   Thread.sleep(2000);
	       }
	       catch (Exception e)
	       {
			   e.printStackTrace();
	       }

		    synchronized(Integer.class)
		      {
		      	System.out.println("in the  Integer Lock of m2");
		      }
}
        
	}
	 public static void main(String[] args)
	{
		 DeadLock d=new DeadLock();

		 DeadLock obj1=new DeadLock(d);
         obj1.start();
		 DeadLock obj2=new DeadLock(d);
         obj2.start();
//    	 DeadLock obj2=new DeadLock();
      
//		  obj1.m1();
//		  obj1.m2();
	}



}