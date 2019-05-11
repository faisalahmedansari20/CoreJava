class ChildClass
{
	int k=90;
	ChildClass()
	{
		System.out.println("Child Class default constructor");
	}
    
	ChildClass(String s)
	{
		System.out.println("Child Class parameterized constructor ");
	}
}

 
class ParentClass extends ChildClass
{
	ParentClass()
	{
		System.out.println("ParentClass default constructor");
	}
	ParentClass(String s)
	{
		System.out.println("Parentclass parameterized constructor");
	}

	public static void main(String[] args)
	{
       ParentClass obj= new ParentClass("yes");
	   System.out.println(obj.k);
	}
}
