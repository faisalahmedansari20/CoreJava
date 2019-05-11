class ParentClass
{
	  public static void mk() 
	{
		System.out.println("in the parent");
	}
}

class ChildClass extends ParentClass
{
	 public static void mk()  
	{
		System.out.println("in the child class");
	}

	public static void main(String[] args)
	{
		ParentClass obj=new ChildClass();
		
			obj.mk();
		
	}
}