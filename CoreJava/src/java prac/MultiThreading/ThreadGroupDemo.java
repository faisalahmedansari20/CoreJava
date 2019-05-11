class MyThread5 extends Thread
      {
         MyThread5(ThreadGroup tg,String name)
      	   {
      	      super(tg,name);
      	   }

      	     public void run()
      	     {
      	     	System.out.println("child Thread="+Thread.currentThread().getName());
        	     	try
        	     	{
        	     		Thread.sleep(1000);
        	     	}
        	     	catch (InterruptedException ie)
        	     	{
        	     	}
             }
      }

class ThreadGroupDemo
{
	public static void main(String[] args)throws Exception
	    {
	    	ThreadGroup tg1=new ThreadGroup("Parent");
            ThreadGroup tg2=new ThreadGroup(tg1,"Child");
	    
	    	MyThread5 t1=new MyThread5(tg1,"childThread1");
	    	MyThread5 t2=new MyThread5(tg1,"childThread2");
 	    
//          MyThread5 t3=new MyThread5(tg2,"childThread3	");
//	    	MyThread5 t4=new MyThread5(tg2,"childThread4");
	    
 	    
	        t1.start();
	        t2.start();
//	        t3.start();
//	        t4.start();
	    
            Thread t=Thread.currentThread();
	        System.out.println("Thread before  ActiveCount="+tg1.activeCount()+" in the group="+t.getThreadGroup().getName()+" and parent group="+t.getThreadGroup().getParent().getName());
            System.out.println("Thread before activeGroupCount="+tg1.activeGroupCount());
	        tg1.list(); 
//	        tg2.list();
            
	        Thread.sleep(1000);
	        System.out.println("after sleep active count ="+tg1.activeCount());
	        System.out.println("after sleep Groupactive count ="+tg2.activeGroupCount());
	        tg1.list();
	    }
}
