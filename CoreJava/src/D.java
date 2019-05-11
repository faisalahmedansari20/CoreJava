class C
{
static	int a=10;

	public void mk()
	{
//		System.out.println(a);
	}
}

public class D
{
    public static void main(String[] args)
	{
		C obj1=new C();
		C obj2=new C();
//		System.out.println(obj1.a);

		obj1.a=20;
		System.out.println("obj1.a="+obj1.a);
        System.out.println("obj2.a="+obj2.a);

       obj2.a=30;

        System.out.println("obj1.a="+obj1.a);
        System.out.println("obj2.a="+obj2.a);
		

        


	}
}