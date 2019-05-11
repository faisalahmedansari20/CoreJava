class Inheritance
{
  int id=20;
}

public class ChildInheritance extends Inheritance
{
	int id=10;
	public static void main(String[] args)
	{
       ChildInheritance obj=new ChildInheritance();
      
	  System.out.println(obj.id);
	}
}