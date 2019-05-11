class Paren
{
	{
		System.out.println("in the parent instance");
	}
}

class Child  
{
	public void m1()
	{
		System.out.println(x);
				int x=20;
	}

	public static void main(String[] args)
	{
//		Paren obj=new Paren();
      Child obj=new Child();
	  obj.m1();
	}
}