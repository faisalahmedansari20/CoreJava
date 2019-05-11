public class Sleep  extends Thread
{
 	public void run()
	{
	 for(int i=1;i<10;i++)
	 {
		 try
		 {
			 Thread.sleep(1000);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		}
		  System.out.print(" :"+i);
	 }
	}

	public static void main(String[] args) 
	{
	  Sleep s=new Sleep();
	  Sleep s1=new Sleep();
	  
	  s.start();
	  s1.start();

	}

}
