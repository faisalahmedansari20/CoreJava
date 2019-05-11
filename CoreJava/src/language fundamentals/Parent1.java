class Parent1
{
	public void mk()
	{
		System.out.println("in the mk");
	}

	public static void main(String[] args)
	{
       Parent1 obj=new Parent1();
	   obj.mk();
	}
}
		x
class Child1 extends Parent1
{
   public static void main(String[] args)
	{
	}
}