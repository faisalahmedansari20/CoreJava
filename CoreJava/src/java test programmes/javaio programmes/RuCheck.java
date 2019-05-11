class MainRUn extends Thread
{
     public void mk()
	{
		 System.out.println("hi="+this.getName());
	}
	public void gk()
	{
		System.out.println("by="+this.getName());
	}
	synchronized public void run()
	{
		System.out.println("inserted into run method="+this.getName());
		try
		{
			mk();
			Thread.sleep(2000);
			gk();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class RuCheck
{
	public static void main(String[] args)
	{
       MainRUn t1=new MainRUn();
	   MainRUn t2=new MainRUn();
	   MainRUn t3=new MainRUn();
       
      t1.setName("one");
      t2.setName("two");
      t3.setName("three");

	   t1.start();
	   t2.start();
	   t3.start();
	}
}