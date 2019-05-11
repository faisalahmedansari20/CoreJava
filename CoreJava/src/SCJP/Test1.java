class Test1
{

	
	{
		m1();
		System.out.println("first in the instance block i=");
	}
	Test1()
	{
		System.out.println("in the constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("int the unreferences constructor "+new Test1().i);
		 System.out.println();
		 Test1 obj=new Test1(); 
		obj.i=200;
		System.out.println();
		System.out.println(obj.i);
		Test1 obj1=new Test1(); 
		System.out.println();
		System.out.println("in the main method");
		System.out.println();
		Test1 obj12=new Test1(); 
	}
	public void m1()
	{ 
		System.out.println("in the j="+j);
	}
	{
		System.out.println("in the Second instance block");
	}
	int j=20;
	int i=10;

}