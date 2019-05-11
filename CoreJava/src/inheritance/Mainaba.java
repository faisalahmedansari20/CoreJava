class A
{
	 int k=20;
}
class B extends A
{
	int k=30;
}

public class Mainaba
{
	public static void main(String[] args)
	{
		B obj=new B();
		 System.out.println(obj.k);
	}
}