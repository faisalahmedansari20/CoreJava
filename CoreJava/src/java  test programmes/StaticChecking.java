class StaticChecking
{
	int b;
  	 static int a;

     static{
     	    System.out.println(a);
     }

	public static void main(String[] args)
	{
        StaticChecking.a=50;

     	    System.out.println(StaticChecking.a);
		StaticChecking obj1=new StaticChecking();
		StaticChecking obj2=new StaticChecking();

		obj1.a=10;
	    obj2.a=20;
		System.out.println("with Object1="+obj1.a);
		System.out.println("with Object2="+obj2.a);
   
         System.out.println(StaticChecking.a);

	}
}