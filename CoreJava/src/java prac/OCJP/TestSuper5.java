class Over
{
	public void mk(int i)
	{
		System.out.println("in the mk int");
	}
	public void mk(float f)
	{
		System.out.println("in the mk float");
	}
	public static void main(String[] args)
	{
		Over obj=new Over();
		obj.mk(49);
	}
}