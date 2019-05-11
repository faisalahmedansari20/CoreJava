class Throws
{
	public static void main(String[] args)throws InterruptedException
	{
		doStuff();
      System.out.println("in the main method");
	}
	public static void doStuff()throws InterruptedException
	{
		doMoreStuff();
		System.out.println("in the doMoreStuff method");
	}
	public static void doMoreStuff()throws InterruptedException
	{
		Thread.sleep(1000);
	}
}