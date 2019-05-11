class IntChecking
{
	int i;
	public void mk(int i)
	{
		System.out.println(" in the Integer"+i);
	}
//	public void mk(double i)
//	{
//		System.out.println(" in the int");
//	}

	public static void main(String[] args)
	{
       IntChecking obj=new IntChecking();
       obj.i=30;
	   obj.mk(-10);
//       System.out.println(obj.i);
       
//	   obj.i=20;

//       System.out.println(obj.i);
//	   obj.mk(10.3d);
	}
}