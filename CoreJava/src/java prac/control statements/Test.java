interface Interf
{
	public void m1();
}

class Test
{
	int x=10;

	public void m2()
	{
		int y=30;

		Interf i=()->
		{
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}

	public static void main(String[] args)
	{
		Test t=new Test();
		t.m2();
   }
}