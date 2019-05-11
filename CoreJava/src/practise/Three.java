interface One
{
          void add();
		  void add1();
}
interface Two
{
  	void add();
	void add3();
}
class Three implements One,Two
{
public	void add()
	{
	System.out.println("add executed");
	}
	public void add1()
	{
		 System.out.println("add1 is executed");
	}
	public void add3()
	{
		System.out.println("add3 is executed");
	}
	public static void main(String[] args)
	{
		 Three obj=new Three();
		 obj.add();
	     obj.add1();
	}
}