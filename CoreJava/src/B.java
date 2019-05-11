class A
{
	int a;
	static int b;

	public void mk()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void gk()
	{
		System.out.println(b);
	}
}

public class B
{
	public static void main(String[] args)
	{
		A.b=10;
		A.gk();

		A a1=new A();
		A a2=new A();

		System.out.println("a1.a="+a1.a);
		System.out.println("a1.b="+a1.b);
       
	     a1.mk();
		 a2.gk();

		System.out.println(" before a1.b=20; is a2.b"+a2.b);
          a1.b=20;
		System.out.println("after before a1.b=20 is a2.b"+a2.b);


	}
}