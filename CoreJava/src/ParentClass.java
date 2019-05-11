class ParentClass
{
	 public void mk()
	{
		  System.out.println("parent clas method");
	}
}

public class ChildClass extends ParentClass
{
	public void mk()
	{
		System.out.println("child class mk is called");
	}
	public static void main(String[] args)
	{
      ParentClass parent=new ParentClass();
	   parent.mk();
	}
  
}