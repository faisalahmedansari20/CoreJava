class Checked1
{
	public void mk(double l,double l2)
	{
		System.out.println("in the long "+l+" "+l2);
	}
//	public void mk(int... i)
//	{
//		System.out.println("in the var args");
//	}
	public static void main(String[] args)
	{
        Checked1 obj=new Checked1();
		obj.mk(20,30);
//		obj.mk();
	}
}