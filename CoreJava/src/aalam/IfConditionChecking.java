class IfConditionChecking
{
	public void mk(int x,int y)
	{
		if((x+y)>=10)
		{
			System.out.print("yes \n");
			System.out.println("no");
		}
		else
		{
			System.out.println("number is less than");
		}
	}
	public static void main(String[] args)
	{
		IfConditionChecking obj=new IfConditionChecking();

		  obj.mk(13,4);
	}
}