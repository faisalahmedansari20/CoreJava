class MainThreadMethod
{
	public static void main(String[] args)
	{
		
		 for(int i=0;i<10;i++)
		{
			 System.out.println("in the main thread");

		}
		Thread t=new Thread()
		{
			public void run()
			{
				for(int i=0;i<10;i++)
				{
				System.out.println("in the child thread");
				}
			}
		};
		t.start();
		 
	}
}