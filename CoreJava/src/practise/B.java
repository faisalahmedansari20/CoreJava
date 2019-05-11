class A
{
 A get()
 {
  return this;
  }
}

class B extends A
{
  B get()
     {
       return this;
      }
	  void message()
	{
		   System.out.println("B is invoked");
	}

	public static void  main(String[] args)
	{
        B b=new B();
		b.message();
		new B().get().message();
	}
}