import java.util.*;
class Parent 
{
	public void mk(int x) throws IOException
	{
		System.out.println("in the parent");
	}
}
class Child extends Parent
{
	public  void  mk(int x)throws IOException
	{
		System.out.println(" in the child");
	}
	public static void main(String[] args)
	{
		Parent obj=new Child();
		try
		{
 		obj.mk(20);
		}
		catch (Exception e)
		{
		}

}
}