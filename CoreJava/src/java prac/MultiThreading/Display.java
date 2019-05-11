class Display extends Thread
{
	public void run()
	{
		for (int i=0;i<=10 ;i++ )
		{
			System.out.println("Good Morning=");
			try
			{
				Thread.sleep(20);
			}
			catch (InterruptedException e)
			{
				System.out.println("in the catch block");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Display obj=new Display();
		obj.start();
		obj.interrupt();
		System.out.println("end of the main mrthod ");
	}

}









































//class Display
//{
//	public void wish(String s)
//	{
//		for (int i=0;i<=10 ;i++ )
//		{
//			System.out.print("Good Morning=");
//			try
//			{
//				Thread.sleep(20);
//			}
//			catch (Exception e)
//			{
//			}
//			System.out.println(s);
//		}
//	}
//	
//	public static void main(String[] args)
//	{
//		Display obj=new Display();
//		obj.wish("wakeel");
//	}
//
//}