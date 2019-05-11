class Outer11
{
	public void mk()
	{
		class Inner1
		{
			public void sum(int x,int y)
			{
				System.out.println("addition of the no is="+(x+y));
			}
			Inner1 obj=new Inner();
			obj.sum(10,20);
		}
	}
	public static void main(String[] args)
	{
		Outer1 o=new Outer1();
		o.mk();
	}
}