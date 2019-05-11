class Out1
{
	int x=30;
	int y=20;

	public static void mk()
	{
		class InOut1
		{
			public void gk()
			{
				System.out.println(x);
				System.out.println(y);
		   }
		}
		InOut1 obj=new InOut1();
		obj.gk();
	}
	public static void main(String[] args)
	{
		Out1 o=new Out1();
		o.mk();
	}
}