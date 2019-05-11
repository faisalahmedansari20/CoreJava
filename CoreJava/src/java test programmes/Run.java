class  Run
{
	public static void main(String[] args) 
	{
		try
		{
		System.out.println("write character");
		int i=System.in.read();
		System.out.println((char)i);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
	