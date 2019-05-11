class A
{
	int k=10;

	static 
	{
		System.out.println("Static initializer block of parent");
	}

	{
		System.out.println("instance block of parent");
	}
}

 class B extends A
 {
   int j;
 }

 public Class C
 {
	 public static void main(String[] args)
	 { 
		 B b=new B();
	 }
 }
