abstract class A1  
{
   abstract public void mk();
   abstract public void gk();

	public void mn()
	{
		System.out.println("hi");
	}
}

 abstract class A2 extends A1
{
	public void same()
	{
		System.out.println("how are you");
	}
}

public class AbstractClassChecking extends A2
{
    public void mk()
	{
		System.out.println("mk in main");
	}
	public void gk()
	{
		System.out.println("gk in main");
	}

	public static void main(String[] args)
	{
		A2 obj=new AbstractClassChecking();
		obj.mk();
		obj.same();
	    obj.mn();
	}

}

