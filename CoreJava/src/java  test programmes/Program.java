class A
{
	static{
			System.out.println("hi");
	}
}

public class Program
{
	public static void main(String[] args) throws Exception
	{
		Class c=Class.forName("A");
		Object o=c.newInstance();	
	}
}