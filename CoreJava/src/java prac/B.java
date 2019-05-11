class A
{
	static{
				System.out.println("in static of A");
	}
	{
				System.out.println("in instance of A");
	}


	A()
	{
		super();
      System.out.println("A");
	}
}

class B extends A
{
	static{
				System.out.println("in static of B ");
	}
	{
				System.out.println("in instance of B");
	}
	B()
	{
		super();
		System.out.println("B");
	}
	public static void main(String[] args)
	{
		B obj=new B();


	}
}