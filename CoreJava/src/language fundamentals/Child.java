class Parent
{
	public void mk()
	{
		System.out.println("in the mk");
	}

	public static void main(String[] args)
	{
       Parent obj=new Parent();
	   obj.mk();
	}
}

class Child extends Parent
{
   public static void main(String[] args)
	{
	}
}