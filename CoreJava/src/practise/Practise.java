class ParentPractise
{
  public void mk()
	{
	   System.out.println("parent");
	}
}

public class ChildPractise
{
	protected void mk()
	{
		 System.out.println("child");
	}
	public static void main(String[] args)
	{
        ParentPractise obj=new ChildPractise();
		obj.mk();
	}
			
}