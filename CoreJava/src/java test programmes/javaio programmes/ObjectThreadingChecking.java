class ObjectThreadingChecking extends Thread
{
          static int k=2;
	synchronized public void run()
	{
	       k++;	
		 System.out.println(Thread.currentThread().getName()+"="+k+" sop1");
	     k++;
        System.out.println(Thread.currentThread().getName()+"="+k+" sop2");
	   
	    k++;
		System.out.println(Thread.currentThread().getName()+"="+k+" sop3");
	}

    public static void main(String[] args)
	{ 
		ObjectThreadingChecking obj1=new ObjectThreadingChecking();
		obj1.setName("Thread 1");
		
		ObjectThreadingChecking obj2=new ObjectThreadingChecking();
		obj2.setName("Thread 2");

		obj1.start();
       try
       {
	     obj1.join();
       }
       catch (Exception e)
       {
		   e.printStackTrace();
       }
        
		obj2.start();

	}
}
	  