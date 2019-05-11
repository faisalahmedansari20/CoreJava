class PrintingEvenOddNumbers
{
	public void mk(int x)
	{
		if(x>1)
		{

			System.out.println("while loop will execute");
		while(x>=1)
		{
			if(x%2==0)
			{
				System.out.println("it is even number and square of"+x+"="+x*x);
			}
			else
			{
				System.out.println("it is a odd number and square of"+x+"="+x*x);
			}
			x--;
		}
		}
		}
	public static void main(String[] args)
	{

      PrintingEvenOddNumbers obj=new PrintingEvenOddNumbers();
	    obj.mk(10);
	}
}

