class ParentClass
{ 
	int  x=10;
	 public void mk()
	{
		  System.out.println("parent class mk method is called");
	}
}

public class ChildClass extends ParentClass
{
	int x=20;
	public void mk()
	{
		System.out.println("child class mk is called");
	}
	public static void main(String[] args)
	{
      ParentClass parent=new ParentClass();
	   parent.mk();

	   ChildClass parentref=new ChildClass();
	     parentref.mk();
         System.out.println(parentref.x);

	}
  
}