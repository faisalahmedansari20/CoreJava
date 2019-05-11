class ParentPractise
{
   void mk()
	{
	   System.out.println("parent");
	}
}

public class ChildPractise extends ParentPractise
{
	 void mk()
	{
		 System.out.println("child");
	}
	public static void main(String[] args)
	{
        ParentPractise obj=new ChildPractise();
		obj.mk();
	}
			
}