class ParentInstance
{
	ParentInstance()
	{
		System.out.println("Parentinstance constructor default");
	}
      ParentInstance(int k)
	{
		System.out.println("Parentinstance constructor parameterized");
	}
	{
				System.out.println("instance initializer block of ParentInstance");
	}
    
}



class Instance extends ParentInstance
{
	Instance()
	{
		System.out.println("instance constructor default");
	}
	Instance(int k)
	{
		System.out.println("instance constructor parameterized");
	}
	{
		System.out.println("instance initializer block of Instance");
	}

  public static void main(String[] args)
	{
       Instance obj=new Instance();
	   Instance obj1=new Instance(10);
	}
}