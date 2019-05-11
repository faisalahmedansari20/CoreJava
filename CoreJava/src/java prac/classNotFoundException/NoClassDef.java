public class NoClassDef
{
	public static void main(String[] args)
	{
		try
		{
			Sample obj=new Sample();
			obj.mk();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

