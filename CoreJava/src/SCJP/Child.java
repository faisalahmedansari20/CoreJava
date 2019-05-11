class Child
{

	{
		m1();
		System.out.println("in the instance x is ");
	}
	public void m1()
	{
		System.out.println("in the m1 x is="+x);
	}
	 Child()
	{
		 this(49);
		 System.out.println("in the no arg constructor ");

	}
     Child(int i)
	{
		 System.out.println("in the paremeter constructor "+i+" and x is "+x);
	}

		int x=44;

	public static void main(String[] args)
	{
		Child obj=new Child();
	}
}