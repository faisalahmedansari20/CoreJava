class ReminderChecking
{
	public void mk(int z)
	{
		while(z>=1)
		{
			int rem=z%10;
			System.out.println("reamining number is ="+rem);
			 z=z/10;
			 System.out.println("total remain number after dividing ="+z);
		}
		System.out.println("value is less than equal to 1");
	}
	public static void main(String[] args)
	{
		ReminderChecking obj=new ReminderChecking();
		obj.mk(1234);
	}
}