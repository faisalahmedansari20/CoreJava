class ParentClass1
{
	static int x=888;
	  public  void mk(int...x) 
	{
		System.out.println("in the parent");
	}
}

class ChildClass1 extends ParentClass1
{
	static int  x=999;
	 public  void mk(int... x)  
	{
		System.out.println("in the child class");
	}

	public static void main(String[] args)
	{
		ParentClass1 obj1=new ParentClass1();
		ChildClass1 obj2=new ChildClass1();
		ParentClass1 obj=new ChildClass1();

            System.out.println(obj.x);
//			obj.mk(10);
		
	}
}