class B
{
	int a;
	static int b;

	 public void mk()
	{
		 System.out.println(b);
         System.out.println(a);
	}

	public static gk()
	{
		System.out.println(b);
	}
}

public class C
{
	public static void main(String[] args)
	{
		B.b=10;
		B.gk();

		B b1=new B();
		B b2=new B();

		System.out.println(b1.b);
		System.out.println(b1.a);

		b1.mk();
		b1.gk();

		System.out.println(b1.b);
		b1.b=20;
		System.out.println(b2.b);
	}

}