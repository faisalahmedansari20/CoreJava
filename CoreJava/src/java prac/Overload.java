class Overload
{
//	public void mk(int i)
//	{
//		System.out.println("in the int"+i);
//	}
	public void mk(float f)
	{
		System.out.println("in the float ="+f);
	}
	public static void main(String[] args)
	{
       Overload obj=new Overload();
	   obj.mk(20);
	}
}