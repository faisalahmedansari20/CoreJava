class ParentFinal
{
	public  void mk(int a)
	{
		System.out.println("in the ParentFinal Class");
	}
}




class FinalClass extends ParentFinal
{
	public final void mk(int a)
	{
		System.out.println("in the child class");
	}

//	public final void mk(int a, int b)
//	{
//		System.out.println(a+" "+b);
//	}

	public static void main(String[] args)
	{
		FinalClass obj=new FinalClass();
		obj.mk(4);
	}

}