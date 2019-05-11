class AssignmentOperator
{
	public static void main(String[] args)
	{
		int x=10,y=20;

		if((x>=10) || (++y>=20))
		{
			System.out.println("x="+x);
		}
		else
		{
		 System.out.println("y="+y);
		}
		System.out.println("x="+x+" and "+" y="+y);
	}
}