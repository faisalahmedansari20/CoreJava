class A
{
	int i=5;
}

class B extends A
{
	public void mk()
	{
		System.out.println(new A().i);
	}
	public static void main(String[] args)
	{
       B obj=new B();
	   obj.mk();
	}
}