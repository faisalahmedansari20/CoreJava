class Over
{
public void mk(float f)
	{
		System.out.println("in the mk float");
	}
	public void mk(byte i)
	{
		System.out.println("in the mk int");
	}
	
	public static void main(String[] args)
	{
		Over obj=new Over();
		obj.mk(49);
	}
}