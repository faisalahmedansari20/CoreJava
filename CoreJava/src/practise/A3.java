abstract class A1  
{
   abstract public void mk();
   abstract public void gk();

	public void mn()
	{
		System.out.println("hi");
	}
}

abstract class  MiddleClass extends A1
 {
    
 }

  class A3 
{
    public void mk()
	{
	}

	public void gk()
	{
	}
 

	public void same()
	{
		System.out.println("how are you");
	}
	public static void main(String[] args)
	{
		A3 obj=new A3();
	}
}


