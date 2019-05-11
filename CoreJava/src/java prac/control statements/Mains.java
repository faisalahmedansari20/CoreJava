interface Left
{
  default void m1()
	{
	  System.out.println("Left");
	}
}

interface Right
{
   default void m1()
	{
	   System.out.println("Right");
	}
}

class Mains implements Left,Right
{
	public void m1()
	{
		Left.super.m1();
	}

	public static void main(String[] args)
	{
		Mains obj=new Mains();
		obj.m1();
	}
	
}